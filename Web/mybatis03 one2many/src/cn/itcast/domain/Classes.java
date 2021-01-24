package cn.itcast.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Classes {
    private Integer id;
    private String name;
    private List<Student> students;
}