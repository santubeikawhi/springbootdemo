package com.jl.springboot.mapperDbSecondary;

import com.jl.springboot.domain.TestCustomer;
import com.jl.springboot.domain.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName TestCustomerMapper
 * @Description TODO
 * @Author Jiangl
 * @Date 2019/4/30 16:40
 * @Version 1.0
 */

@Component
@Mapper
public interface TestCustomerMapper {
    @Select("select ID_,User_name FROM TEST_CUSTOMER")
    @Results(value = { @Result(column = "user_name", property = "userName"),@Result(column = "ID_", property = "id") })
    public List<TestCustomer> getAllTestuser();
}
