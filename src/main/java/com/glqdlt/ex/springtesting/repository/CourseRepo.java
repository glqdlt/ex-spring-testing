package com.glqdlt.ex.springtesting.repository;

import com.glqdlt.ex.springtesting.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepo extends JpaRepository<Course, Integer> {

}
