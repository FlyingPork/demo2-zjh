package com.example.demo.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Start {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String start(Model model){
        model.addAttribute("UserID", "1");
        return "/byffff/Product";
    }
}
