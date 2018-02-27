package com.faint.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.faint.domain.PostVO;

@Repository
public class PostDAOImpl implements PostDAO {

	@Inject
	private SqlSession sqlSession;

	private static final String namespace = "com.faint.mapper.MemberMapper";

	@Override
	public String getTime() {

		return sqlSession.selectOne(namespace + ".getTime");
	}

	@Override
	public void insertMember(PostVO vo) {
		sqlSession.insert(namespace + ".insertMember", vo);
	}

}