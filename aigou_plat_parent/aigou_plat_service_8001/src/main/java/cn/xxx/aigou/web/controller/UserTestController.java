package cn.xxx.aigou.web.controller;

import cn.xxx.aigou.common.AjaxResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserTestController {
    @RequestMapping("/testuser")
    public AjaxResult testUser(){
        Map<String,String> map = new HashMap<>();
        map.put("name", "哈哈哈");
        return AjaxResult.me().setSuccess(true).setMsg("账号密码是乱写的").setObject(map);
    }
}
