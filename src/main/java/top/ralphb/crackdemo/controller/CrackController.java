package top.ralphb.crackdemo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class CrackController {
    @RequestMapping("/first")
    public String first(Model model) {
        System.out.printf("test");
        model.addAttribute("message", "Hello World!");
        return "login";
    }
}
