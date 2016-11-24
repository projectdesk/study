package com.study.dao;

import org.apache.ibatis.session.SqlSession;

public class BoardService {
	SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public void select(int no){
		sqlSession.selectOne("boardMapper.selectBoard",no);
	}
	
}
