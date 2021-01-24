package cn.itcast.domain;

import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProvinceRedis {
    private Integer id;
    private String name;
    private String provinceId;
}
