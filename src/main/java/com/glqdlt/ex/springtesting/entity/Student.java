package com.glqdlt.ex.springtesting.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer seq;

    private String id;
    private String name;
    private Integer old;
    private Gender gender;

    @OneToMany
    @JoinColumn(name = "seq")
    private Set<Course> courses;

    @CreationTimestamp
    private Date regDate;

}
