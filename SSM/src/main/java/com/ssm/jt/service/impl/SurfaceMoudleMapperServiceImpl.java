package com.ssm.jt.service.impl;

import com.ssm.jt.mapper.SurfaceMoudleMapper;

import com.ssm.jt.model.SurfaceMoudle;
import com.ssm.jt.service.SurfaceMoudleMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jt
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-11-09 18:20
 */
@Service
public class SurfaceMoudleMapperServiceImpl implements SurfaceMoudleMapperService {
    @Autowired
    private SurfaceMoudleMapper surfaceMoudleMapper;
    @Override
    public List<SurfaceMoudle> select() {
        return surfaceMoudleMapper.select();
    }
    @Override
    public List<SurfaceMoudle> selectbyid(Integer id,SurfaceMoudle surfaceMoudle) {
        return surfaceMoudleMapper.selectbyid(id);
    }
}
