package com.itheima.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private String number;  //学号
    private String name;    //姓名
    private Date birthday;  //生日
    private String address; //地址

}
