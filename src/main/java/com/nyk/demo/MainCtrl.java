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

    @RequestMapping("/3_1_04A")
    public String get3_1_04A(){
        return "3_1_04A";
    }

    @RequestMapping("/3_1_05A")
    public String get3_1_05A(){
        return "3_1_05A";
    }

    @RequestMapping("/3_2_1")
    public String get3_2_01A(){
        return "3_2_1";
    }

    @RequestMapping("/3_3_1")
    public String get3_3_01A(){
        return "3_3_1";
    }
}
