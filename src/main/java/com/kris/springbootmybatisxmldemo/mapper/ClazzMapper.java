package com.kris.springbootmybatisxmldemo.mapper;

import com.kris.springbootmybatisxmldemo.entity.po.ClazzPO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ClazzMapper {

    List<ClazzPO> findAll();
}
