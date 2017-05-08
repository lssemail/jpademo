package com.demo.common.test;

import com.demo.common.entity.Organization;
import com.demo.common.service.OrganService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by shuai on 2017/5/8.
 */
public class OrganServiceTest extends SpringBaseTest {

    @Autowired
    OrganService service;

    //@Test
    public void addOrgan() {
        Organization organ = new Organization();
        organ.setName("固原市政府");
        service.saveOrganiziton(organ);
        System.out.println(organ.toString());
    }

    @Test
    public void organList() {
        List<Organization> list = service.findAll();
        for (Organization org: list) {
            System.out.println(org.toString());
        }

    }

}
