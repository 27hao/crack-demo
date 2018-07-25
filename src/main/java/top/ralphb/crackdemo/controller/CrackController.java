package top.ralphb.crackdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import top.ralphb.crackdemo.dao.UserDao;

@Controller
public class CrackController {
    @Autowired
    UserDao userDao;
    @RequestMapping("/index")
    public String index(Model model) {
        return "login";
    }
    @RequestMapping("/login")
    public String login(@RequestParam("user") String user,@RequestParam("pass") String pass) {
        if(userDao.login(user,pass)) {
            return "success";
        }else {
            return "fail";
        }
    }
}

