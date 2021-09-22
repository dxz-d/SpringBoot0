package com.example.demo;

import com.example.demo.bean.User;
import com.example.demo.bean.UserDomain;
import com.example.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Scheduled;
import org.thymeleaf.standard.expression.Each;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date today = new Date();
        // 当前日期
        String endDate = sdf.format(today);
        Calendar theCa = Calendar.getInstance();
        theCa.setTime(today);

        // 一月之后日期
        theCa.add(theCa.MONTH, 1);
        Date start = theCa.getTime();
        String startDate = sdf.format(start);

        // 一年之后日期
        theCa.add(Calendar.YEAR, 1);
        Date date = theCa.getTime();
        String aYearAgo = sdf.format(date);

        System.out.println("当前日期：" +endDate+ ",30天之后的日期:" +startDate+ ",一年之后的日期：" +aYearAgo);
    }

    @Autowired
    private UserMapper userMapper;

    @Test
    void selectMp() {
        List<UserDomain> userDomains = userMapper.selectList(null);
        userDomains.forEach(System.out::println);
    }

    @Test
    void insert() {
        UserDomain userDomain = new UserDomain();

        userDomain.setUserId(99);
        userDomain.setNow(new Date());
        userDomain.setSex(1);
        userDomain.setUserName("哎");
        userMapper.insert(userDomain);

        System.out.println("userDomain:" +userDomain);
    }

    @Test
    @Scheduled(cron = "0/30 * * * * *")
    public void work(){
        System.out.print("执行一次\n");
    }


}
