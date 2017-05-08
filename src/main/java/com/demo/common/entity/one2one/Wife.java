package com.demo.common.entity.one2one;

import javax.persistence.*;

/**
 * Created by shuai on 2017/5/8.
 * OneToOne 双向关联
 */
@Entity
public class Wife {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    //注意：由于是双向的一对一关系。作为关系的被维护端。需要在wife实体中添加和 husband 关联的属性
    //mappedBy 注释:指定了，这个实体是被关系维护端的那个属性所维护。
    //在本例中，Wife实体是被 Hhusband实体中的外键“wife”所维护。
    @OneToOne(mappedBy = "wife")
    private Husband husband;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Husband getHusband() {
        return husband;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
