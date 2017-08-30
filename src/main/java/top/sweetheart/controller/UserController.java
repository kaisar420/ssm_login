package top.sweetheart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import top.sweetheart.entity.User;
import top.sweetheart.service.IUserService;

import javax.annotation.Resource;

@Controller
public class UserController {

    @Resource
    private IUserService userService;

    @RequestMapping("/")
    public String index() {
        return "login";
    }

    @RequestMapping("login")
    public String login(String user_name, String user_password) {
        if (userService.login(new User(user_name, user_password)) != null) {
            return "success";
        } else {
            return "fail";
        }
    }
}