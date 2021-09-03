package com.example.demo.mapper;

import com.example.demo.bean.Resource;
import com.example.demo.util.MyMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ResourceMapper extends MyMapper<Resource> {

    List<Resource> queryAll();

    List<Resource> loadUserResources(Map<String, Object> map);
}
