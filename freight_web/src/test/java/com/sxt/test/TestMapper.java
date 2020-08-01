package com.sxt.test;


import com.sxt.service.DeptService;
import com.sxt.service.UserpService;
import com.sxt.util.TreeNode;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext-web.xml","classpath:applicationContext-service.xml","classpath:applicationContext-mapper.xml"})
public class TestMapper {

    @Autowired
    private DeptService service;
    
    @Autowired
    private UserpService userpService;

    @Test
    public void testDeptService() throws Exception {
        String max1 = service.findMaxDeptnoByParentId(null);
        String max2 = service.findMaxDeptnoByParentId("487c9a41736d48b98bd6b5330e4179bd");
        System.out.println(max1);
    }
    
    //测试获取用户树节点
    @Test
    public void testGetTreeNode() throws Exception {
        List<TreeNode> degreeTree = userpService.getDegreeTree(null);
        if(degreeTree != null){
            System.out.println(degreeTree.size());
        }
    }
}
