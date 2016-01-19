package com.nicekkong.ex00;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;

/**
 * Created by nicekkong on 2016. 1. 17..
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class DataSourceTest {

    @Inject
    private DataSource ds;

    @Test
    public void testConnection() throws Exception {
        try{
            Connection con = ds.getConnection();
            System.out.println("=======================================");
            System.out.println(con);
            System.out.println("=======================================");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
