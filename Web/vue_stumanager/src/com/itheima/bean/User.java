package com.itheima.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
    用户实体类
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    private String username; //账号
    private String password; //密码
}
