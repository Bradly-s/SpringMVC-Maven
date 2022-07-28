package com.jack.service.impl;

import com.jack.dao.CarGo;
import com.jack.dao.CarGoDao;
import com.jack.service.ICargoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class CargoServiceImpl implements ICargoService {

    //@Autowired：注入引用类型，自动装配模式，默认按类型装配
    @Autowired
//    //@Qualifier：自动装配bean时按bean名称装配
//    @Qualifier("cargo")
    private CarGoDao carGoDao;

    public void save(CarGo account) {
        carGoDao.save(account);
    }

    public void update(CarGo account){
        carGoDao.update(account);
    }

    public void delete(Integer id) {
        carGoDao.delete(id);
    }

    public CarGo findById(Integer id) {
        return carGoDao.findById(id);
    }

    public List<CarGo> findAll() {
        return carGoDao.findAll();
    }
}
