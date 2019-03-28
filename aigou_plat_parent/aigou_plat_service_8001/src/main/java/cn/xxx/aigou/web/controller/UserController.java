package cn.xxx.aigou.web.controller;

import cn.xxx.aigou.common.AjaxResult;
import cn.xxx.aigou.domain.User;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/plat")
public class UserController {
    /*
        @RequestBody主要用来接收前端传递给后端的json字符串中的数据的
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody User user){
        //模拟登录--假设已经从数据库中查出来账号密码
        if(user!=null&& !StringUtils.isEmpty(user.getName())&&!StringUtils.isEmpty(user.getPassword())){
            if("admin".equals(user.getName())&&"1234".equals(user.getPassword())){
                return AjaxResult.me().setSuccess(true).setMsg("登录成功").setObject(null);
            }
        }
        return AjaxResult.me().setSuccess(false).setMsg("登录失败").setObject("账号密码不正确");
    }
}
