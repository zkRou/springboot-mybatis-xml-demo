package com.kris.springbootmybatisxmldemo.mapper;

import com.kris.springbootmybatisxmldemo.entity.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {

    List<Student> findAll();
}
