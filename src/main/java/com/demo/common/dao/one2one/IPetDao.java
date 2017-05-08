package com.demo.common.dao.one2one;

import com.demo.common.entity.one2one.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shuai on 2017/5/8.
 */
public interface IPetDao extends JpaRepository<Pet, Long> {
}

