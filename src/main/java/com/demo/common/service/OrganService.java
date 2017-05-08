package com.demo.common.service;

import com.demo.common.dao.IOrganDao;
import com.demo.common.entity.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shuai on 2017/5/8.
 */

@Service
public class OrganService {

    @Autowired
    IOrganDao organDao;

    public Organization saveOrganiziton(Organization organ) {

        return organDao.save(organ);
    }

    public List<Organization> findAll() {

        return organDao.findAll();
    }
}
