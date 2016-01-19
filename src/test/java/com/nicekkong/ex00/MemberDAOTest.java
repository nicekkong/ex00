package com.nicekkong.ex00;

import com.nicekkong.dao.MemberDAO;
import com.nicekkong.domain.Member;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import java.util.List;

/**
 * Created by nicekkong on 2016. 1. 19..
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class MemberDAOTest {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Inject
    private MemberDAO dao;

    @Test
    public void testTime() throws Exception {

        logger.debug(dao.getTime());
        System.out.println("dao.getTime()" + dao.getTime());
    }

    //@Test
    public void testInsertMember() throws Exception {

        Member member = new Member();
        member.setUserid("0003");
        member.setUserpw("0003");
        member.setUsername("홍길동");
        member.setEmail("nicekkng@gmail.com");

        dao.insertMember(member);
    }

    @Test
    public void 전체멤버조회하기_테스트() throws Exception {
        List<Member> members = dao.getAllMember();
        logger.debug("\n ");
        logger.debug("====================> 전체멤버조회하기_테스트 시작 <============================");

        int count = 0;
        for(Member member : members){
            logger.debug(count++ + "번째 : " + member.toString());

        }
        members.toString();
        logger.debug("====================> 전체멤버조회하기_테스트 종료 <============================\n");
    }
}
