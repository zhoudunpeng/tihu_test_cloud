package com.zdp.web;

import com.alibaba.fastjson.JSONObject;
import com.zdp.common.ResponseMsg;
import com.zdp.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


/**
 * @author sesshomaru
 * @date 2020/5/29
 */

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service-url.user-service}")
    private String userServiceUrl;

    @GetMapping("/getUserById")
    public ResponseMsg findUserById(@RequestParam Integer id){
      return restTemplate.getForObject(userServiceUrl+"/user/getUserById?id={1}",ResponseMsg.class,id);
    }

    @PostMapping("/save")
    public ResponseMsg save(@RequestBody User user){
        return restTemplate.postForObject(userServiceUrl + "/user/create",user,ResponseMsg.class);
    }

    @PostMapping("/delete")
    public ResponseMsg delete(@RequestBody JSONObject data){
        return restTemplate.postForObject(userServiceUrl+"/user/delete",data,ResponseMsg.class);
    }

}
