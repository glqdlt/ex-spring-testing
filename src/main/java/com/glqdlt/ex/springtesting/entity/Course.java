package com.glqdlt.ex.springtesting.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;
    private String name;
    private String description;

    @OneToMany
    @JoinColumn(name = "seq")
    Set<Student> students;

}
