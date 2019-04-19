package com.kris.springbootmybatisxmldemo;

import com.kris.springbootmybatisxmldemo.entity.po.ClazzPO;
import com.kris.springbootmybatisxmldemo.entity.po.CoursePO;
import com.kris.springbootmybatisxmldemo.entity.po.StudentPO;
import com.kris.springbootmybatisxmldemo.entity.vo.StudentClazzVO;
import com.kris.springbootmybatisxmldemo.mapper.ClazzMapper;
import com.kris.springbootmybatisxmldemo.mapper.CourseMapper;
import com.kris.springbootmybatisxmldemo.mapper.StudentMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SpringbootMybatisXmlDemoApplicationTests {

	@Autowired
	private ClazzMapper clazzMapper;

	@Autowired
	private CourseMapper courseMapper;

	@Autowired
	private StudentMapper studentMapper;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findAll() {
		List<ClazzPO> clazzPOS = clazzMapper.findAll();
		log.info("All classes:{}", clazzPOS);

		List<CoursePO> coursePOS = courseMapper.findAll();
		log.info("All course:{}", coursePOS);

		List<StudentPO> studentPOS = studentMapper.findAll();
		log.info("All students:{}", studentPOS);

		List<StudentClazzVO> studentClazzVOS = studentMapper.findAllWithClazz();
		log.info("All students with class:{}", studentClazzVOS);
	}

	public void countByGrade() {
		int countByGrade = studentMapper.countByGrade("一年级");
		log.info("");
	}
}
