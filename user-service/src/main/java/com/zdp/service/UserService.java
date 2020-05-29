package com.zdp.service;

import com.google.gson.Gson;
import com.zdp.domain.User;
import com.zdp.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sesshomaru
 * @date 2020/5/29
 */
@Service
public class UserService {

    private static Gson gson = new Gson();

    @Autowired
    private UserMapper userMapper;

    public User findUserById(int id){
        return userMapper.selectById(id);
    }

    public boolean saveUser(User user){
        return  userMapper.insert(user) > 0 ? true : false;
    }

    public boolean updateUser(User user){
        return userMapper.updateById(user) >0 ? true : false;
    }

    public boolean delete(int id){
        return userMapper.deleteById(id) >0 ? true : false;
    }

    public boolean myDel(Integer id){
        return userMapper.myDel(id) >0 ? true : false;
    }


}
