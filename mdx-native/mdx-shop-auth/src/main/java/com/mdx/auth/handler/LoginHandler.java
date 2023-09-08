package com.mdx.auth.handler;

import com.mdx.auth.dto.MdxUserDto;
import com.mdx.common.em.LoginTypeEnum;

/**
 * @Classname LoginHandler
 * @Description TODO
 * @Date 2023/4/1 19:49
 * @Created by baiyang
 */

public interface LoginHandler {
    LoginTypeEnum extension();
    MdxUserDto login();
}
