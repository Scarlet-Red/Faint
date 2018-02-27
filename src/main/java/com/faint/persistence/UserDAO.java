package com.faint.persistence;

import java.util.List;

import com.faint.domain.UserVO;

public interface UserDAO {
	
	public void create(UserVO vo) throws Exception;
	
	public UserVO read(Integer id) throws Exception;
	
	public void update(UserVO vo) throws Exception;
	
	public void delete(Integer id) throws Exception;
	
	public List<UserVO> listAll() throws Exception;
	
}
