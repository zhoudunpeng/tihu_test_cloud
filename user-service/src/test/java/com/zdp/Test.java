package com.zdp;

import com.google.gson.Gson;
import com.zdp.domain.User;
import com.zdp.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author sesshomaru
 * @date 2020/5/29
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = UserServiceApplication.class)
public class Test {

    @Autowired
    private UserMapper userMapper;

    @org.junit.Test
    public void test1(){
        List<User> userList = userMapper.selectList(null);
        Gson gson = new Gson();
        String json = gson.toJson(userList);
        log.info(json);
    }
}
