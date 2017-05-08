package com.demo.common.service;

import com.demo.common.dao.one2one.IHusbandDao;
import com.demo.common.dao.one2one.IPeopleDao;
import com.demo.common.dao.one2one.IPetDao;
import com.demo.common.dao.one2one.IWifeDao;
import com.demo.common.entity.one2one.Husband;
import com.demo.common.entity.one2one.People;
import com.demo.common.entity.one2one.Pet;
import com.demo.common.entity.one2one.Wife;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shuai on 2017/5/8.
 */
@Service
public class One2OneService {

    @Autowired
    IPeopleDao peopleDao;

    @Autowired
    IPetDao petDao;


    @Autowired
    IHusbandDao husbandDao;

    @Autowired
    IWifeDao wifeDao;

    public void savePeople(People people) {
        peopleDao.save(people);
    }

    public void savePet(Pet pet) {
        petDao.save(pet);
    }

    public List<People> findAll() {
        return peopleDao.findAll();
    }

    public Pet findOne(Long id) {
        return petDao.findOne(id);
    }

    public void deletePet(Pet pet) {
        petDao.delete(pet);
    }

    public void saveHusband(Husband husband) {
        husbandDao.save(husband);
    }

    public void saveWife(Wife wife) {
        wifeDao.save(wife);
    }

    public List<Wife> findAllWife() {
        return wifeDao.findAll();
    }

    public List<Husband> findAllHusband() {
        return husbandDao.findAll();
    }

    public void deleteHusband(Long id) {
        husbandDao.delete(id);
    }

    public void deleteWife(Long id) {
        wifeDao.delete(id);
    }

}
