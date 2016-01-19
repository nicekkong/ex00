package com.nicekkong.dao;

import com.nicekkong.domain.Member;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return sqlSession.selectList(namespace + ".selectAllMember");
    }

    @Override
    public Member readMember(String userid) throws Exception {
        return sqlSession.selectOne(namespace + ".selectMember", userid);
    }

    @Override
    public Member readMemberWithPw(String userid, String userpw) throws Exception {
        Map<String, Object> paramMap = new HashMap<String, Object>();

        paramMap.put("userid", userid);
        paramMap.put("userpw", userpw);

        return sqlSession.selectOne(namespace + ".selectMemberWithPw", paramMap);
    }


}