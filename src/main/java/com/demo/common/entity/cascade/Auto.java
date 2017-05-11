package com.demo.common.entity.cascade;

import com.demo.common.entity.BaseModel;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/9.
 */
@Entity
public class Auto{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String autonum;

    @ManyToOne
    @JoinColumn(name = "gid")
    private Garage garage;

    public String getAutonum() {
        return autonum;
    }

    public void setAutonum(String autonum) {
        this.autonum = autonum;
    }

    public Garage getGarage() {
        return garage;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

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
}
