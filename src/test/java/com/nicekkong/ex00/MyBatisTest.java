package com.nicekkong.ex00;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

/**
 * Created by nicekkong on 2016. 1. 18..
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:/application-context.xml"})
public class MyBatisTest {

    @Inject
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testSqlSessionFactory() {
        System.out.println("=====> " + sqlSessionFactory);
    }

    @Test
    public void testSession() {
        try {
            SqlSession session = sqlSessionFactory.openSession();
            System.out.println("=====> " + session);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
