package cn.itcast.service;

import cn.itcast.domain.City;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CityService {

    List<City>findByPid(String pid)throws Exception;
}
