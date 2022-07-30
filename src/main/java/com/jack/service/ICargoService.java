package com.jack.service;

import com.jack.domain.Cargo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional //表示所有方法进行事务管理
public interface ICargoService {

    public boolean save(Cargo cargo);

    public boolean delete(Integer id);

    public boolean update(Cargo carGo);

    public List<Cargo> findAll();

    public Cargo findById(Integer id);

//    Cargo getById(Integer id);
}
