package com.demo.common.test;

import com.alibaba.fastjson.JSON;
import com.demo.common.entity.Organization;
import com.demo.common.entity.Role;
import com.demo.common.entity.User;
import com.demo.common.service.OrganService;
import com.demo.common.service.RoleService;
import com.demo.common.service.UserService;
import com.demo.util.json.SimplePropertyFilter;
import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/17
 * @Description:
 * @CodeReviewer:
 */
public class UserServiceTest extends SpringBaseTest {
	@Autowired
	UserService service;

	@Autowired
	OrganService organService;

	@Autowired
	RoleService roleService;

	//@Test
	public void testJpa() {
		List<User> users = service.find();
		SimplePropertyFilter filter = new SimplePropertyFilter();
		System.out.println(JSON.toJSONString(users, filter));
	}

	@Test
	public void testJpaGson() {
		List<User> users = service.find();
		Gson gson = new Gson();
		gson.toJson(users);
		System.out.println(gson.toJson(users));
	}

	//@Test
	public void testOrganization(){
		List<User> list = new ArrayList<User>();
		list = service.findByOrganizationName("北京市政府");
		System.out.println(list.size());
	}


	//@Test
	public void addUser() {
		User user = new User();
		user.setName("李达康");

		Organization organ = new Organization();
		organ.setName("汉中市长");
		organService.saveOrganiziton(organ);
		user.setOrganization(organ);

		service.save(user);

		System.out.println(user);
		System.out.println(organ);

	}

	//@Test
	public void userAddRoles() {
		User user = service.findByName("李达康");
		Role role = new Role();
		role.setRoleName("市长");
		roleService.save(role);
		System.out.println(role);
		user.getRoles().add(role);
		role = new Role();
		role.setRoleName("GDP");
		roleService.save(role);
		System.out.println(role);

		user.getRoles().add(role);

		service.save(user);
		System.out.println(user);
	}

	@Test
	public void detail() {
		User user = service.findByName("李达康");
		System.out.println(user);
	}

}
