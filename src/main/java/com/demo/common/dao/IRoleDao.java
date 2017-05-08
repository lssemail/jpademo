package com.demo.common.dao;

import com.demo.common.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shuai on 2017/5/8.
 */
public interface IRoleDao extends JpaRepository<Role, String> {
}
