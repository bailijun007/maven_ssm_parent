package com.blj.dao;

import com.blj.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    //查找全部用户
    @Select("select * from user")
    public List<User> finfAll();

    //保存用户信息
    @Insert("INSERT INTO user(userName,password,name,telephone,unit,role,landmark,enterdate)\n" +
            "   values (#{userName},md5(#{password}),#{name},#{telephone},#{unit},#{role},#{landmark},#{enterdate})")
    public int savaUser(User user);
}
