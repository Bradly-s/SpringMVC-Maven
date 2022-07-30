package com.jack.service.impl;

import com.jack.domain.Cargo;
import com.jack.dao.CargoDao;
import com.jack.service.ICargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CargoServiceImpl implements ICargoService {

    //@Autowired：注入引用类型，自动装配模式，默认按类型装配
    //    //@Qualifier：自动装配bean时按bean名称装配
//    @Qualifier("cargo")
    @Autowired
    private CargoDao cargoDao;

    public boolean save(Cargo cargo) {

        return cargoDao.save(cargo) > 0;
    }

    public boolean update(Cargo cargo){

        return cargoDao.update(cargo) > 0;
    }

    public boolean delete(Integer id) {

        return cargoDao.delete(id)  > 0;
    }

    public Cargo findById(Integer id) {
        return cargoDao.findById(id);
    }


    public List<Cargo> findAll() {
        return cargoDao.findAll();
    }
}
