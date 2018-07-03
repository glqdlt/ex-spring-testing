package com.glqdlt.ex.springtesting;

import com.glqdlt.ex.springtesting.entity.Course;
import com.glqdlt.ex.springtesting.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringtestingApplication implements CommandLineRunner {

    @Autowired
    CourseRepo courseRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringtestingApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {


    }
}
