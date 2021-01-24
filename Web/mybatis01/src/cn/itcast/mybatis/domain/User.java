package cn.itcast.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer uid;
    private String name;
    private String password;
    private String email;
    private String birthday;//数据库中是Date类型，java中可以是Date，也可以是String类型
}

