package cn.itcast.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer emp_id;
    private String emp_name;
    private Integer dept_id;
    private Double emp_wage;
}
