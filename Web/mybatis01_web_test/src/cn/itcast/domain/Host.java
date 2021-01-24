package cn.itcast.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Host implements Serializable {
    private String type;
    private Integer rent;
    private Integer area;
    private Double agencyprice;
}
