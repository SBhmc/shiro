package com.ssm.jt.controller;

import com.ssm.jt.model.SurfaceMoudle;
import com.ssm.jt.service.SurfaceMoudleMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author jt
 * @site www.xiaomage.com
 * @company xxx公司
 * @create  2019-11-09 19:16
 */
@Controller
@RequestMapping("/vue/user")
public class MoudleController {
    @Autowired
    private SurfaceMoudleMapperService surfaceMoudleMapperService;

    private SurfaceMoudle SurfaceMoudle=new SurfaceMoudle();

    @RequestMapping("/select")
    @ResponseBody
    public List<SurfaceMoudle> select(){
        List<SurfaceMoudle> select = surfaceMoudleMapperService.select();
        for (SurfaceMoudle surfaceMoudle:select){
            TreeNode(surfaceMoudle.getId(),surfaceMoudle);
        }
      return select;
    }

    public void TreeNode(Integer id,SurfaceMoudle surfaceMoudle){
        List<SurfaceMoudle> selectbyid = surfaceMoudleMapperService.selectbyid(id,surfaceMoudle);
        surfaceMoudle.setChild(selectbyid);
    }









}
