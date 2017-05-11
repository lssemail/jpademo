package com.demo.common.service;

import com.demo.common.dao.cascade.IAutoDao;
import com.demo.common.dao.cascade.IGarageDao;
import com.demo.common.entity.cascade.Auto;
import com.demo.common.entity.cascade.Garage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/9.
 */
@Service
public class CascadeService {

    @Autowired
    IAutoDao autoDao;

    @Autowired
    IGarageDao garageDao;

    public void saveAuto(Auto auto) {
        autoDao.save(auto);
    }

    public void saveGarage(Garage garage) {
        garageDao.save(garage);
    }

    public List<Garage> findAllGarages() {
        return garageDao.findAll();
    }

    public void delete(Garage ga) {
        garageDao.delete(ga);
    }


}
