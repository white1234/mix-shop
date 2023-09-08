package com.mdx.gateway.handler;


import cn.dev33.satoken.exception.DisableServiceException;
import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.exception.NotRoleException;
import com.mdx.common.em.BaseErrorEnum;
import com.mdx.common.exception.BaseException;
import com.mdx.common.response.BaseResponse;
import com.mdx.common.response.RespGenerator;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.naming.NoPermissionException;


/**
 * @Description ExceptionHandlerMethodResolver.getMappedMethod()
 * 会首先找到可以匹配处理异常的所有方法信息，然后对其进行从小到大的排序，
 * 最后取最小的那一个匹配的方法(即匹配度最高的那个)。
 * @Author teronb
 * @Date 2023/1/30 17:38
 */

@RestControllerAdvice
public class GlobalExceptionHandler {
    /** 静态变量，系统日志**/
    private static final Log logger = LogFactory.getLog(GlobalExceptionHandler.class);

    //处理自定义异常
    @ExceptionHandler(value = BaseException.class)
    public BaseResponse<Object> baseExceptionHandler(BaseException e){
        logger.error("发生业务异常！原因是："+e.getMessage());
        return RespGenerator.fail(e.getCode(),e.getMessage());
    }

    //处理空指针异常
    @ExceptionHandler(value = NullPointerException.class)
    public BaseResponse<Object> exceptionHandler(NullPointerException e){
        logger.error("发生空指针异常！原因是：",e);
        return RespGenerator.fail(BaseErrorEnum.BODY_NOT_MATCH);
    }


    @ResponseBody
    //处理其他异常
    @ExceptionHandler(value = Exception.class)
    public BaseResponse<Object> exceptionHandler(Exception e){
        if(e instanceof NotLoginException){
            return RespGenerator.fail(BaseErrorEnum.USER_INVALID);
        }
        else if(e instanceof NotRoleException){
            return RespGenerator.fail(BaseErrorEnum.USER_NO_ROLE);
        }
        else if (e instanceof NoPermissionException) {
            return RespGenerator.fail(BaseErrorEnum.USER_NO_PERMISSION);
        }
        else if (e instanceof DisableServiceException) {
            return RespGenerator.fail(BaseErrorEnum.USER_NAME_LOCK);
        }

        logger.error("未知异常！原因是：",e);
        return RespGenerator.fail(BaseErrorEnum.INTERNAL_SERVER_ERROR);
    }
    

}
