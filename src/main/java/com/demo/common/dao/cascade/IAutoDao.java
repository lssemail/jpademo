package com.demo.common.dao.cascade;

import com.demo.common.entity.cascade.Auto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/5/9.
 */
public interface IAutoDao extends JpaRepository<Auto, Long>{
}
