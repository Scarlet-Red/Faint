package com.faint.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.faint.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "com.faint.mapper.UserMapper";
	
	@Override
	public void create(UserVO vo) throws Exception{
		session.insert(namespace+".create", vo);
	}
	
	@Override
	public UserVO read(Integer id) throws Exception{
		return session.selectOne(namespace+".read", id);
	}
	
	@Override
	public void update(UserVO vo) throws Exception{
		session.update(namespace+".update", vo);
	}
	
	@Override
	public void delete(Integer id) throws Exception{
		session.delete(namespace+".delete", id);
	}
	
	@Override
	public List<UserVO> listAll() throws Exception{
		return session.selectList(namespace+".listAll");
	}
	

}
