package com.offcn.project.service;
import com.offcn.project.po.TReturn;
import java.util.List;

public interface ProjectInfoService {
    /**
     * 获取项目回报列表
     * @param projectId
     * @return
     */
    List<TReturn> getProjectReturns(Integer projectId);
}