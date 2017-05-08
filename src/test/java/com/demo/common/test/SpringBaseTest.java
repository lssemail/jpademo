package com.demo.common.test;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: sunqianqian
 * @Date: 2015/9/17
 * @Description:
 * @CodeReviewer:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml", "classpath:spring-jpa.xml"})
public class SpringBaseTest {
    @Before
    public void init() {
        System.out.println("---------  test begin -----------");
    }

    @After
    public void after() {
        System.out.println("---------  test finish -----------");
    }
}
