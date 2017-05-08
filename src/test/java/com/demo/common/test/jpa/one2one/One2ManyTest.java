package com.demo.common.test.jpa.one2one;

import com.demo.common.entity.one2many.School;
import com.demo.common.entity.one2many.Student;
import com.demo.common.service.One2ManyService;
import com.demo.common.test.SpringBaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

/**
 * Created by shuai on 2017/5/8.
 */
public class One2ManyTest extends SpringBaseTest {

    @Autowired
    One2ManyService one2ManyService;

    @Test
    public void add() {
        School school = new School();
        school.setName("政法学院");
        one2ManyService.addSchool(school);

        Student student0 = new Student();
        student0.setName("猴子");
        student0.setSchool(school);
        one2ManyService.addStudent(student0);


        Student student1 = new Student();
        student1.setName("程海");
        student1.setSchool(school);
        one2ManyService.addStudent(student1);


        school.addStudent(student0);
        school.addStudent(student1);
        one2ManyService.addSchool(school);
        System.out.println(school.toString());

    }
    @Test
    public void testCacaedSave() {
        //TODO 这个级连删除有问题 需研究研究
        School school = new School();
        school.setName("政法学院");

        Student student0 = new Student();
        student0.setName("猴子");
        student0.setSchool(school);


        Student student1 = new Student();
        student1.setName("程海");
        student1.setSchool(school);

        school.addStudent(student0);
        school.addStudent(student1);
        one2ManyService.addSchool(school);
    }
}
