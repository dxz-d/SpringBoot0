package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.bean.UserDomain;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author: dxz
 * @date: 2021/6/17 10:49
 */
@Mapper
public interface  UserMapper extends BaseMapper<UserDomain> {
}
