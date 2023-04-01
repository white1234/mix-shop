package com.mdx.user.handler;

import com.alibaba.csp.sentinel.slots.block.BlockException;

import javax.servlet.http.HttpServletRequest;

/**
 * @Classname SentinelLockExceptionHanler
 * @Description TODO
 * @Date 2023/3/25 23:38
 * @Created by baiyang
 */

public class userOrderBlockHandler {
    /**
     * 限流后续操作方法
     * @param e
     * @return
     */
    public static String getOrderBlockHandler(String orderId, String userId, HttpServletRequest request, BlockException e){
        String msg = "不好意思，前方拥挤，请您稍后再试";
        return msg;
    }
}
