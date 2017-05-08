package com.demo.common.dao;

import com.demo.common.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/17
 * @Description:
 * @CodeReviewer:
 */
@Repository
public interface IUserDao extends PagingAndSortingRepository<User,String>{

	User findByName(String name);

	List<User> findByOrganizationName(String name);
}
