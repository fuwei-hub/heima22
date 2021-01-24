package cn.itcast.dao;

import cn.itcast.domain.City;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityDao {

    @Select("SELECT _id 'id',NAME 'name',city_id 'cityId',province_id 'provinceId' FROM city WHERE province_id=#{pid}")
    List<City>findByProvinceID(String pid)throws Exception;
}
