package com.example.demo.dozer;

import org.springframework.stereotype.Component;

import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: vo与domain互转工具类
 * @author: dxz
 * @date: 2021/6/17 10:57
 */
@Component
public class DozerBeanMapperWrapper {

    private static DozerBeanMapper dozerBeanMappee = new DozerBeanMapper();


    public <T> T mapper(Object source, Class<T> destinationClass) {

        return dozerBeanMappee.map(source, destinationClass);

    }


    public void mapper(Object source, Object destinationSource) {

        dozerBeanMappee.map(source, destinationSource);

    }


    public <T> List<T> mapperList(List<?> sources, Class<T> destinationClass) {

        List<T> targetList = new ArrayList<T>();

        for (Object source : sources) {

            targetList.add(dozerBeanMappee.map(source, destinationClass));

        }

        return targetList;

    }

}
