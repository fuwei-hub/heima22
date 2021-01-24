package com.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)//该注解只能作用在方法上
@Retention(RetentionPolicy.RUNTIME)//所有的自定义注解必须加
public @interface ResponseBody {
}
