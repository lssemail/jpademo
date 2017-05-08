package com.demo.common.service;

import com.demo.common.dao.IUserDao;
import com.demo.common.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/10
 * @Description:
 * @CodeReviewer:
 */
@Service
public class UserService {

	@Autowired
	IUserDao dao;


	public List<User> find() {
		return (List<User>) dao.findAll();
	}

	public User findByName(String name) {
		return dao.findByName(name);
	}

	public List<User> findByOrganizationName(String name){
		return dao.findByOrganizationName(name);
	}

	public User save(User user) {
		return dao.save(user);
	}
}
