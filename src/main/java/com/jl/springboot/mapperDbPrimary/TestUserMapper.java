package com.jl.springboot.mapperDbPrimary;

import com.jl.springboot.domain.TestUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface TestUserMapper {

    @Select("select ID_,User_name FROM TEST_USER")
    @Results(value = { @Result(column = "user_name", property = "userName"),@Result(column = "ID_", property = "id") })
    public List<TestUser> getAllTestuser();
}
