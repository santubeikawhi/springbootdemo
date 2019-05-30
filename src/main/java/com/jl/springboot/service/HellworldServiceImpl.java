package com.jl.springboot.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @ClassName HellworldServiceImpl
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/24 14:07
 * @Version 1.0
 */
@Component
public class HellworldServiceImpl implements HelloworldService {
    @Override
    public void helloService() {
        System.out.println("service");
    }
}
