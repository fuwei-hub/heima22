package cn.itcast.dao;

import cn.itcast.domain.ProvinceRedis;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ProvinceDao {

    @Select("select _id 'id',name 'name',province_id 'provinceId' from province ")
    List<ProvinceRedis>findAll()throws Exception;
}
