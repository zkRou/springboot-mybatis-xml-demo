package com.kris.springbootmybatisxmldemo.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentClazzVO {

    private Integer id;

    private String name;

    private Boolean gender;

    private Integer age;

    private String grade;

    private String clazz;
}
