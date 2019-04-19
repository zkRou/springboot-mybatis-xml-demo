package com.kris.springbootmybatisxmldemo.mapper;

import com.kris.springbootmybatisxmldemo.entity.po.StudentPO;
import com.kris.springbootmybatisxmldemo.entity.vo.StudentClazzVO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface StudentMapper {

    List<StudentPO> findAll();

    List<StudentClazzVO> findAllWithClazz();

    Integer countByGrade(String grade);
}
