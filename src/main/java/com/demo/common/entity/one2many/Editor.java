package com.demo.common.entity.one2many;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Administrator on 2017/5/9.
 */
@Entity
public class Editor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    /**
     * 因为Magazine类对于@ManyToOne没有额外修饰, 所以数据库中magazine表会根据约定自动产生一个creator_id（也就是属性"creator"+_id）并生成外键指向user表的id，
     * 通过magazine表的creator_id和user表的id的join来获取相关的数据。
     */
    @OneToMany(mappedBy = "editor")
    //@JoinColumn(name = "main_creator_id", referencedColumnName = "common_user_id")
    private List<Maganize> maganizes;
}
