package com.jl.springboot.controller;

import com.jl.springboot.domain.TestCustomer;
import com.jl.springboot.domain.TestUser;
import com.jl.springboot.mapperDbPrimary.TestUserMapper;
import com.jl.springboot.mapperDbSecondary.TestCustomerMapper;
import com.jl.springboot.service.HelloworldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName HelloWorld
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/24 11:21
 * @Version 1.0
 */
@RestController
public class HelloWorld {
    @Autowired
    private HelloworldService helloworldService;
    @Autowired
    private TestUserMapper testUserMapper;
    @Autowired
    private TestCustomerMapper testCustomerMapper;
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String helloMethod(){
        helloworldService.helloService();
        List<TestUser> result = testUserMapper.getAllTestuser();
        for(TestUser tui : result){
            System.out.println("userID:"+tui.getId()+",userName:"+tui.getUserName());
        }

        List<TestCustomer> result2 = testCustomerMapper.getAllTestuser();
        for(TestCustomer tui : result2){
            System.out.println("userID:"+tui.getId()+",userName:"+tui.getUserName());
        }

        return "hello World";
    }
}
