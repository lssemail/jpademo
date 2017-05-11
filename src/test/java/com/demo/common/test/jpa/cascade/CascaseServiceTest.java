package com.demo.common.test.jpa.cascade;

import com.demo.common.entity.cascade.Auto;
import com.demo.common.entity.cascade.Garage;
import com.demo.common.service.CascadeService;
import com.demo.common.test.SpringBaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/5/9.
 */
public class CascaseServiceTest extends SpringBaseTest {

    @Autowired
    CascadeService cascadeService;

    //@Test
    public void  add() {
        Garage garage = new Garage();
        garage.setName("garage");

        Auto auto1 = new Auto();
        auto1.setName("auto1");
        auto1.setGarage(garage);

        Auto auto2 = new Auto();
        auto2.setName("auto2");
        auto2.setGarage(garage);



        garage.getAutoList().add(auto1);
        garage.getAutoList().add(auto2);

//        cascadeService.saveAuto(auto1);
//        cascadeService.saveAuto(auto2);
        cascadeService.saveGarage(garage);
    }

    @Test
    public void delete(){
        List<Garage> garageList = cascadeService.findAllGarages();
        for(Garage garage : garageList) {
            System.out.println(garage.getAutoList().size());
            //cascadeService.delete(garage);
        }
    }
}
