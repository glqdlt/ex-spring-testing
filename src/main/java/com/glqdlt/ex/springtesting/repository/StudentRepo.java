package com.glqdlt.ex.springtesting.repository;

import com.glqdlt.ex.springtesting.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {

    Student findById(String id);

}
