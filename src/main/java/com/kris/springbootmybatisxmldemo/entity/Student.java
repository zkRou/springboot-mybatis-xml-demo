package com.kris.springbootmybatisxmldemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Integer id;

    private String name;

    private Boolean gender;

    private Integer age;

    private Integer classId;
}
