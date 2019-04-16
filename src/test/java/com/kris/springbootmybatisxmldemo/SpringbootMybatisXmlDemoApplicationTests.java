package com.kris.springbootmybatisxmldemo;

import com.kris.springbootmybatisxmldemo.entity.Clazz;
import com.kris.springbootmybatisxmldemo.mapper.ClazzMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMybatisXmlDemoApplicationTests {

	@Autowired
	private ClazzMapper clazzMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test(){
		List<Clazz> list = clazzMapper.findAll();
		System.out.println(list);
	}
}
