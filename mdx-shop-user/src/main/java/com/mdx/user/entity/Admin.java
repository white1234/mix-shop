package com.mdx.user.entity;

import lombok.Data;

import javax.swing.*;
import java.util.Date;

/**
 * @Classname Admin
 * @Description TODO
 * @Date 2023/4/1 13:23
 * @Created by baiyang
 */
@Data
public class Admin {
    private Integer id;

    private String name;

    private String avatar;

    private String password;

    private String pw;

    private String phone;

    private Integer roleId;

    private Integer status;

    private String createByAid;

    private Date createTime;

    private Date loginTime;

    private String loginIp;

    private Integer loginCount;
}
