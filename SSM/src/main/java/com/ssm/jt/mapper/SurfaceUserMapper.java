package com.ssm.jt.mapper;

import com.ssm.jt.model.SurfaceUser;
import org.springframework.stereotype.Repository;

@Repository
public interface SurfaceUserMapper{
      SurfaceUser login(SurfaceUser surfaceUser);
}