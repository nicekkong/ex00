package com.nicekkong.dao;

import com.nicekkong.domain.Member;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by nicekkong on 2016. 1. 19..
 */

@Repository
public class MemberDAOImpl implements MemberDAO {

    @Inject
    private SqlSession sqlSession;

    private static final String namespace = "com.nicekkong.mapper.MemberMapper";


    @Override
    public String getTime() {
        return sqlSession.selectOne(namespace+".getTime");
    }

    @Override
    public void insertMember(Member member) {
        sqlSession.insert(namespace + ".insertMember" , member);

    }

    @Override
    public List<Member> getAllMember() {
        return sqlSession.selectList(namespace+".selectAllMember");
    }
}
