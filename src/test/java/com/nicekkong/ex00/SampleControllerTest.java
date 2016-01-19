package com.nicekkong.ex00;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import javax.inject.Inject;

/**
 * Created by nicekkong on 2016. 1. 19..
 */

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/mvc*.xml"})
public class SampleControllerTest {

    private static final Logger logger = LoggerFactory.getLogger(SampleControllerTest.class);

    @Inject
    private WebApplicationContext wac;
    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        logger.info("@Before setup......");
    }

    @Test
    public void testDoA() throws Exception {
        logger.info("==============>testDoA()<===================");
        mockMvc.perform(MockMvcRequestBuilders.get("/doC?msg=john"));
        mockMvc.perform(MockMvcRequestBuilders.get("/doJSON"));
    }
}
