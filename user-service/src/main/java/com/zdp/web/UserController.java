package com.zdp.web;

import com.alibaba.fastjson.JSONObject;
import com.zdp.common.ResponseMsg;
import com.zdp.domain.User;
import com.zdp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author sesshomaru
 * @date 2020/5/29
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseMsg create(@RequestBody User user){
      return ResponseMsg.success(userService.saveUser(user));
    }

    @GetMapping("/getUserById")
    public ResponseMsg getUserById(@RequestParam Integer id){
        int a = 1 / 0;
      return ResponseMsg.success(userService.findUserById(id));
    }

    @PostMapping("/delete")
    public ResponseMsg delete(@RequestBody JSONObject data){
        Integer id = data.getInteger("id");
        return ResponseMsg.success(userService.delete(id));
    }
}
