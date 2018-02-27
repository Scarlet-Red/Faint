package com.faint.web;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.faint.domain.UserVO;
import com.faint.persistence.UserDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
		//locations ={"file:src/main/webapp/WEB-INF/spring/**/MySQL.xml"})
		locations ={"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class UserDAOTest {
	
	@Inject
	private UserDAO dao;
	
	private static Logger logger = LoggerFactory.getLogger(UserDAOTest.class);
	
	@Test
	public void testCreate() throws Exception{
		UserVO user = new UserVO();
		user.setEmail("didwhdgns2@naver.com");
		user.setPassword("password");
		user.setName("hihai");
		user.setNickname("helloa");
		user.setPhonenumber("010-0008-0000");
		user.setWebsite("hi");
		user.setIntro("반갑습니다 안녕하세요");
		user.setSessionkey("세션키a");
//		user.setSex(1);
//		user.setPri_level(1);
//		user.setSessionlimit(3000);
		System.out.println(dao);
		dao.create(user);
	}
	
//	@Test
//	public void testRead() throws Exception{
//		logger.info(dao.read(1).toString());
//	}
//	
//	@Test
//	public void testUpdate() throws Exception{
//		UserVO user=new UserVO();
//		user.setId(1);
//		user.setIntro("수정된 안녕하세요");
//		dao.update(user);
//	}
//	
//	@Test
//	public void testDelete() throws Exception{
//		dao.delete(1);
//	}
		
	
	
}
