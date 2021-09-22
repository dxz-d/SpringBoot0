package com.example.demo.util;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @description:
 * @author: dxz
 * @date: 2021/9/19 0:07
 */

@Component
public class ZhangSan {
    @Scheduled(fixedDelay=5000)
    public void fixedDelayJob(){
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+" >>fixedDelay执行....");
    }

    @Scheduled(fixedRate=5000)
    public void fixedRateJob(){
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+" >>fixedRate执行....");
    }

    @Scheduled(cron="0 50 * * * ?")
    public void cronJob(){
        System.out.println(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date())+" >>cron执行....");
    }

    @Scheduled(cron="0/2 * * * * ?")//每2秒执行一次
    public void schedule(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime time = LocalDateTime.now();
        String currentTime = df.format(time);
        System.out.println(currentTime+"===定时任务执行！！！");
    }

    @Scheduled(cron = "0/30 * * * * *")
    public void work(){
        System.out.print("执行一次\n");
    }
}
