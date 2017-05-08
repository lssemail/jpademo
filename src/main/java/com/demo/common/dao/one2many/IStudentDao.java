package com.demo.common.dao.one2many;

import com.demo.common.entity.one2many.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by shuai on 2017/5/8.
 */
public interface IStudentDao extends JpaRepository<Student, Long> {
}
