package com.glqdlt.ex.springtesting.service;

import com.glqdlt.ex.springtesting.entity.Course;
import com.glqdlt.ex.springtesting.repository.CourseRepo;
import com.glqdlt.ex.springtesting.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    CourseRepo courseRepo;

    public Set<Course> retrieveCourses(String studentId) {
        return studentRepo.findById(studentId).getCourses();
    }

}
