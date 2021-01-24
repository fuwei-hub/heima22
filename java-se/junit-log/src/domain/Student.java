package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
//这里是使用了那个小辣椒的插件,所有可以通过注解使得程序填充未完成的代码内容
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Serializable {
    private String name;
    private Integer age;
}
