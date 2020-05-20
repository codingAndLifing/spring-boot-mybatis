package com.example.mybatisdemo.dao;

import com.example.mybatisdemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * PaclageName com.example.mybatisdemo.entity
 *
 * @Created on  2020/5/19 0019
 * @Author xumingming
 * @DDesrciption
 */
@Mapper
public interface UserDao {
    List<User> selectUser();


}
