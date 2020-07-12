package com.sxt.service.impl;

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
}
