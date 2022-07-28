package com.jack.service;

import com.jack.dao.CarGo;
import java.util.List;

public interface ICargoService {

    void save(CarGo carGo);

    void delete(Integer id);

    void update(CarGo carGo);

    List<CarGo> findAll();

    CarGo findById(Integer id);

}
