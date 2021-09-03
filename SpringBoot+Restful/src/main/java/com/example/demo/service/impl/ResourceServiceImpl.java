package com.example.demo.service.impl;

import com.example.demo.bean.Resource;
import com.example.demo.mapper.ResourceMapper;
import com.example.demo.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: dxz
 * @date: 2021/9/3 15:49
 */
@Service
public class ResourceServiceImpl implements ResourceService {

    @Autowired
    private ResourceMapper resourcesMapper;

    @Override
    public List<Resource> queryAll() {
        return resourcesMapper.queryAll();
    }

    @Override
    public List<Resource> loadUserResources(Map<String, Object> map) {
        return resourcesMapper.loadUserResources(map);
    }

    @Override
    public Resource selectByKey(Object key) {
        return null;
    }

    @Override
    public int save(Resource entity) {
        return 0;
    }

    @Override
    public int delete(Object key) {
        return 0;
    }

    @Override
    public int updateAll(Resource entity) {
        return 0;
    }

    @Override
    public int updateNotNull(Resource entity) {
        return 0;
    }

    @Override
    public List<Resource> selectByExample(Object example) {
        return null;
    }
}
