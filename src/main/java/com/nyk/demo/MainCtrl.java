package com.nyk.demo;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log
@Controller
public class MainCtrl {

    @RequestMapping("/index")
    public String index(){
        return "home";
    }

    @RequestMapping("/3_1_02A")
    public String get3_1_02A(){
        return "3_1_02A";
    }

    @RequestMapping("/3_1_03A")
    public String get3_1_03A(){
        return "3_1_03A";
    }
}
