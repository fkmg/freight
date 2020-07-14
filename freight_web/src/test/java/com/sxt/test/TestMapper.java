package com.sxt.test;


import com.sxt.service.DeptService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext-web.xml","classpath:applicationContext-service.xml","classpath:applicationContext-mapper.xml"})
public class TestMapper {

    @Autowired
    private DeptService service;

    @Test
    public void testDeptService() throws Exception {
        String max1 = service.findMaxDeptnoByParentId(null);
        String max2 = service.findMaxDeptnoByParentId("487c9a41736d48b98bd6b5330e4179bd");
        System.out.println(max1);
    }
}
