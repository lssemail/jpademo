package com.demo.common.service;

import com.demo.common.dao.one2many.ISchoolDao;
import com.demo.common.dao.one2many.IStudentDao;
import com.demo.common.entity.one2many.School;
import com.demo.common.entity.one2many.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shuai on 2017/5/8.
 */
@Service
public class One2ManyService {

    @Autowired
    IStudentDao studentDao;

    @Autowired
    ISchoolDao schoolDao;

    public void addStudent(Student student) {
        studentDao.save(student);
    }

    public void addSchool(School school) {
        schoolDao.save(school);
    }

    public List<Student> findAllStudents() {
        return studentDao.findAll();
    }

    public List<School> findAlladdSchools() {
        return schoolDao.findAll();
    }

}
