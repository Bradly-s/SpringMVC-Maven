package com.jack.dao;

//mybatis
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface CarGoDao {

    @Insert("insert into cargo (name, standard, number, location, introduction)values(#{name},#{standard},#{number},#{location},#{introduction})")
    void save(CarGo account);

    @Delete("delete from cargo where id = #{id} ")
    void delete(Integer id);

    @Update("update cargo set name = #{name} , standard = #{standard} , number = #{number} , location = #{location} , introduction = #{introduction} where id = #{id} ")
    void update(CarGo account);

    @Select("select * from cargo")
    List<CarGo> findAll();

    @Select("select * from cargo where id = #{id} ")
    CarGo findById(Integer id);
}
