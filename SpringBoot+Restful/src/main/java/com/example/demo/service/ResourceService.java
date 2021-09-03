package com.example.demo.service;

import com.example.demo.bean.Resource;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: dxz
 * @date: 2021/9/3 15:40
 */
public interface ResourceService extends IService<Resource>{

    List<Resource> queryAll();

    List<Resource> loadUserResources(Map<String,Object> map);
}
