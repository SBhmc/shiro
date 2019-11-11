package com.ssm.jt.mapper;

import com.ssm.jt.model.SurfaceMoudle;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SurfaceMoudleMapper {
    List<SurfaceMoudle> select();

    List<SurfaceMoudle> selectbyid(Integer id);


}