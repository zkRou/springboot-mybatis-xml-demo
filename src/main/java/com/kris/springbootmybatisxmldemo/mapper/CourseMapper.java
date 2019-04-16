package com.kris.springbootmybatisxmldemo.mapper;

import com.kris.springbootmybatisxmldemo.entity.Course;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CourseMapper {

    List<Course> findAll();
}
