package com.demo.common.entity.one2many;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/5/9.
 */
@Entity
public class Maganize {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @ManyToOne
    private Editor editor;
}
