package com.demo.common.entity.one2many;

import javax.persistence.*;
import java.util.List;

/**
 * Created by shuai on 2017/5/8.
 * OneToMany 双向一对多
 */
@Entity
public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "school")
    private List<Student> students;

    @Transient
    public void addStudent(Student student) {
        if(students != null) {
            students.add(student);
        }
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

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
