package annos;

import enums.Gender;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//自定义注解类
//- 基本数据类型
//- String
//- Class
//- 注解
//- 枚举
//- 以上类型的一维数组
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    public String name() default "张三";
    public Gender gender() default Gender.MAN;
    public String[] hobby();
}
