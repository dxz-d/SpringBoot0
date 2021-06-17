package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.bean.UserDomain;
import com.example.demo.dozer.DozerBeanMapperWrapper;
import com.example.demo.rusult.Result;
import com.example.demo.rusult.ResultUtil;
import com.example.demo.service.UserService;
import com.example.demo.until.ExcelExportUtils;
import com.example.demo.until.ExcelImportUtils;
import com.example.demo.vo.PersonExportVo;
import com.example.demo.vo.UserVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @description: https://www.jianshu.com/p/8108a55261cf
 * @author: dxz
 * @date: 2021/6/10 16:53
 */
@Controller
@Slf4j
@Api(tags = "easypoi接口", hidden = true)
public class EasyPoiController {

    @Autowired
    private UserService userService;

    @Autowired
    private DozerBeanMapperWrapper dozerBeanMapper;

    @Autowired
    private ExcelExportUtils excelExportUtils;

    @Autowired
    private ExcelImportUtils excelImportUtils;

    /**
     * Export
     *
     * @param response
     */
    @RequestMapping(value = "/export", method = RequestMethod.GET)
    public Result exportExcel(HttpServletResponse response) throws IOException {
        List<UserDomain> userDomainList = userService.list();
        List<UserVo> userList = dozerBeanMapper.mapperList(userDomainList, UserVo.class);
        excelExportUtils.exportExcel(userList, UserVo.class, "用户信息", "员工信息的sheet", "用户信息表");
        return ResultUtil.define(200,"导出excel用户信息成功",userList);
    }


    /**
     * 导入用户信息
     * @param file
     * @return
     */
    @GetMapping(value = "/importExcel")
    @ResponseBody
    public Result importExcel(@RequestParam("file") MultipartFile file) throws Exception {
        List<UserVo> userList = excelImportUtils.importExcel(file, 1, 1, false, UserVo.class);
        List<UserDomain> userDomainList = dozerBeanMapper.mapperList(userList, UserDomain.class);
        userService.saveBatch(userDomainList);
        return ResultUtil.define(200,"导入excel用户信息成功",userList);
    }

    @GetMapping(value = "/findAll")
    @ResponseBody
    public Result findAll() {
        List<User> userList = userService.findAll();
        return ResultUtil.define(200, "查询用户成功", userList);
    }

}
