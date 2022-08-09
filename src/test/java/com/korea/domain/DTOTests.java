package com.korea.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DTOTests {

	@Autowired
	private TestDTO testdto;
	
	@Test
	public void test() {	
		
		//TestDTO dto = new TestDTO("ȫ�浿","44","�뱸");
		//dto.setAddr("���");
		
		TestDTO dto = TestDTO.builder()
				.age("55")
				.name("ȫ�浿")
				.addr("�ּ��ּ�")
				.build();
		System.out.println(dto);
		 
	}
	
	@Test
	public void test2() {
		testdto.setName("ȫ�浿");
		log.info("testDTO : " + testdto);
		
	}

}