package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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



}
