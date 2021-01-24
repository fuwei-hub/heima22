package cn.itcast.dao;

import cn.itcast.domain.Card;
import cn.itcast.domain.Person;
import net.sf.jsqlparser.schema.Column;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CardDao {

    @Select("select * from card")
    @Results({
            @Result (column = "id",property = "id"),
            @Result (column = "number",property = "number"),
            @Result (
                    column = "pid",
                    property = "person",
                    javaType = Person.class,
                    one=@One(select = "cn.itcast.dao.PersonDao.findById")
            )
    })
    List<Card> findAll() throws Exception;

}
