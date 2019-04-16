package com.kris.springbootmybatisxmldemo.mapper;

import com.kris.springbootmybatisxmldemo.entity.Clazz;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClazzMapper {

    List<Clazz> findAll();
}
