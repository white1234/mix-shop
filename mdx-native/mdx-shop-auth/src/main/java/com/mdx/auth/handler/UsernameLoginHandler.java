package com.mdx.auth.handler;

import com.mdx.auth.dto.MdxUserDto;
import com.mdx.common.em.LoginTypeEnum;

/**
 * @Classname UsernameLoginHandler
 * @Description TODO
 * @Date 2023/4/1 19:48
 * @Created by baiyang
 */

public class UsernameLoginHandler implements LoginHandler{
    @Override
    public LoginTypeEnum extension() {
        return LoginTypeEnum.USERNAME;
    }

    @Override
    public MdxUserDto login() {
            return null;
    }
}
