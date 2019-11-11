package com.ssm.jt.service.impl;

import com.ssm.jt.mapper.SurfaceUserMapper;
import com.ssm.jt.model.SurfaceUser;
import com.ssm.jt.service.SurfaceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jt
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-11-08 18:43
 */
@Service
public class SurfaceUserServiceImpl implements SurfaceUserService {
    @Autowired
    private SurfaceUserMapper surfaceUserMapper;

    @Override
    public SurfaceUser login(SurfaceUser surfaceUser) {

        return surfaceUserMapper.login(surfaceUser);
    }
}
