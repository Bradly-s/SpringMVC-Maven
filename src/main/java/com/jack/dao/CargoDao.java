package com.jack.dao;

//mybatis
import com.jack.domain.Cargo;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import java.util.List;

public interface CargoDao {

    @Insert("insert into cargo (name, standard, number, location, introduction)values(#{name},#{standard},#{number},#{location},#{introduction})")
    public int save(Cargo account);

    @Delete("delete from cargo where id = #{id} ")
    int delete(Integer id);

    @Update("update cargo set name = #{name} , standard = #{standard} , number = #{number} , location = #{location} , introduction = #{introduction} where id = #{id} ")
    int update(Cargo account);

    @Select("select * from cargo")
    List<Cargo> findAll();

    @Select("select * from cargo where id = #{id} ")
    Cargo findById(Integer id);
}
