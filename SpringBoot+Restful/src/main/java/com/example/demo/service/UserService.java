package com.example.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo.bean.User;
import com.example.demo.bean.UserDomain;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: dxz
 * @date: 2021/6/3 15:25
 */
@Service
public interface UserService extends IService<UserDomain> {

    /**
     * 新增用户
     * @param user
     * @return
     */
    boolean addUser(User user);

    /**
     * 修改用户
     * @param user
     * @return
     */
    boolean updateUser(User user);


    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(int id);

    /**
     * 根据用户名字查询用户信息
     * @param userName
     */
    User findUserByName(String userName);


    /**
     * 查询所有
     * @return
     */
    List<User> findAll();

}
