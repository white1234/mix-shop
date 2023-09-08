package com.mdx.common.em;

import lombok.Data;

/**
 * @Classname LoginTypeEnum
 * @Description TODO
 * @Date 2023/4/1 19:52
 * @Created by baiyang
 */

public enum LoginTypeEnum {

    USERNAME("login_user_name","用户密码登录"),
    OAUTH("oauth","oauth认证登录");

    private String code;
    private String comment;

    LoginTypeEnum(String code,String comment){
        this.code = code;
        this.comment = comment;
    }

}
