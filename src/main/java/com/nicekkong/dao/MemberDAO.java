package com.nicekkong.dao;

import com.nicekkong.domain.Member;

import java.util.List;

/**
 * Created by nicekkong on 2016. 1. 19..
 */
public interface MemberDAO {

    public String getTime();

    public void insertMember(Member member);

    public Member readMember(String userid) throws Exception;

    public Member readMemberWithPw(String userid, String userpw) throws Exception;

    public List<Member> getAllMember();
}
