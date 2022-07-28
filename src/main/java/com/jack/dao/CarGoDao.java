package com.jack.dao;

import org.springframework.stereotype.Component;

import java.util.List;

public interface CarGoDao {

//    @Insert("insert into cargo (name, standard, number, location, introduction)values(#{name},#{standard},#{number},#{location},#{introduction})")
    void save(CarGo account);

//    @Delete("delete from cargo where id = #{id} ")
    void delete(Integer id);


//    @Update("update cargo set name = #{name} , standard = #{standard} , number = #{number} , location = #{location} , introduction = #{introduction} where id = #{id} ")
    void update(CarGo account);

//    @Select("select * from tbl_account")
    List<CarGo> findAll();

//    @Select("select * from tbl_account where id = #{id} ")
    CarGo findById(Integer id);
}
