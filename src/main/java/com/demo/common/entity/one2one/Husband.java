package com.demo.common.entity.one2one;

import javax.persistence.*;

/**
 * Created by shuai on 2017/5/8.
 * OneToOne 双向关联
 */
@Entity
public class Husband {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    //由于，husband 是这个一对一的关系的主控方，所以，在husband表中添加了一个 wife 的外键。
    //通过这个外键来维护 people和pet的一对一关系，而不是用第三张码表。这个是通过@JoinColumn注释实现的。
    @OneToOne
    @JoinColumn(name = "wife_id")
    private Wife wife;

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

    public Wife getWife() {
        return wife;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    @Override
    public String toString() {
        return "Husband{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wife=" + wife +
                '}';
    }
}
