package com.sxt.service.impl;

import com.sxt.benas.DeptP;
import com.sxt.mapper.DeptPMapper;
import com.sxt.service.DeptService;
import com.sxt.vo.DeptVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptPMapper deptPMapper;

    @Override
    public List<DeptVo> selectDeptAndParent() throws Exception {
        List<DeptVo> deptVos = deptPMapper.selectDeptAndParent();
        return deptVos;
    }

    @Override
    public DeptVo selectDeptAndParentById(String id) throws Exception {
        return deptPMapper.selectDeptAndParentById(id);
    }

    @Override
    public String findMaxDeptnoByParentId(String id) throws Exception {
        return deptPMapper.findMaxDeptnoByParentId(id);
    }

    @Override
    public Integer updateDept(DeptP deptP) throws Exception {

        return deptPMapper.updateByPrimaryKeySelective(deptP);
    }

    @Override
    public Integer saveDept(DeptP deptP) {
        return deptPMapper.insert(deptP);
    }
}
