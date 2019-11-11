package com.ssm.jt.service;

import com.ssm.jt.model.SurfaceMoudle;

import java.util.List;

/**
 * @author jt
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-11-09 18:19
 */
public interface SurfaceMoudleMapperService {
    public List<SurfaceMoudle> select();
    public List<SurfaceMoudle> selectbyid(Integer id,SurfaceMoudle surfaceMoudle);
}
