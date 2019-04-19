package com.kris.springbootmybatisxmldemo.entity.po;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentPO {

    private Integer id;

    private String name;

    private Boolean gender;

    private Integer age;

    private Integer clazzId;
}
