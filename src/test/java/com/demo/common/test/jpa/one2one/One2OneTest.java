package com.demo.common.test.jpa.one2one;

import com.demo.common.entity.one2one.Husband;
import com.demo.common.entity.one2one.People;
import com.demo.common.entity.one2one.Pet;
import com.demo.common.entity.one2one.Wife;
import com.demo.common.service.One2OneService;
import com.demo.common.test.SpringBaseTest;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by shuai on 2017/5/8.
 * OneToOne 单向的
 */
public class One2OneTest extends SpringBaseTest {

    @Autowired
    One2OneService one2OneService;

    //@Test
    public void save() {

        Pet pet = new Pet();
        pet.setName("咖啡猫");
        one2OneService.savePet(pet);

        People people = new People();
        people.setName("王菲");
        people.setPet(pet);
        one2OneService.savePeople(people);

        System.out.println(people);
        System.out.println(pet);
    }

    //@Test
    public void findone() {
        List<People> list = one2OneService.findAll();
        for (People people : list) {
            System.out.println(people);
        }
    }

    //@Test
    public void deletePet() {
        Pet pet = one2OneService.findOne(1L);
        System.out.println(pet);
        one2OneService.deletePet(pet);
    }

    //@Test
    public void addHusband() {
        Husband husband = new Husband();
        husband.setName("候立平");

        Wife wife = new Wife();
        wife.setName("钟小艾");
        //由于husband是主要的为互方，所以必须显示的设置
        husband.setWife(wife);
        //由于关系是双向的，所以，你不必手动的来设置,JPA会自动完成这个操作
        //wife.setHusband(husband);
        one2OneService.saveWife(wife);
        one2OneService.saveHusband(husband);

        System.out.println(wife);
        System.out.println(husband);

    }

    //@Test
    public void testHusband() {
        List<Husband> husbands = one2OneService.findAllHusband();
        for (int i = 0; i < husbands.size(); i++) {
            System.out.println(husbands.get(i));
        }
    }

    //@Test
    public void testWife() {
        List<Wife> wifeList = one2OneService.findAllWife();
        for(Wife wife : wifeList) {
            System.out.println(wife.getHusband());
        }
    }

    @Test
    public void wifeDelete() {
        //由于映射关系所以删除会报错；需要从维护的一端处理
        one2OneService.deleteWife(1L);
    }
    @Test
    public void rightWifeDelete() {
        Wife wife = one2OneService.findAllWife().get(0);
        Husband husband = wife.getHusband();
        husband.setWife(null);
        //删除被维护端，只能手动的先从关系维护端解除关系再删除
        one2OneService.deleteWife(wife.getId());
    }
}
