package com.demo.common.service;

import com.demo.common.dao.IRoleDao;
import com.demo.common.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by shuai on 2017/5/8.
 */
@Service
public class RoleService  {

    @Autowired
    IRoleDao roleDao;

    public void save(Role role) {
        roleDao.save(role);
    }
}
