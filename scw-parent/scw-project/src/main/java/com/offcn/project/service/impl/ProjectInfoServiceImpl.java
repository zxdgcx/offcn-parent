package com.offcn.project.service.impl;

import com.offcn.project.mapper.TReturnMapper;
import com.offcn.project.po.TReturn;
import com.offcn.project.po.TReturnExample;
import com.offcn.project.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectInfoServiceImpl implements ProjectInfoService {
    @Autowired
    private TReturnMapper returnMapper;
    /**
     * 获取项目回报列表
     *
     * @param projectId
     * @return
     */
    @Override
    public List<TReturn> getProjectReturns(Integer projectId) {
        TReturnExample example = new TReturnExample();
        example.createCriteria().andProjectidEqualTo(projectId);
        return returnMapper.selectByExample(example);
    }
}