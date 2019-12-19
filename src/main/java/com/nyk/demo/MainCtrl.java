package com.nyk.demo;

import lombok.extern.java.Log;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log
@Controller
public class MainCtrl {

    @RequestMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping("/3_1_01A")
    public String get3_1_01A(){
        return "3_1_01a";
    }

    @RequestMapping("/3_1_02A")
    public String get3_1_02A(){
        return "3_1_02a";
    }

    @RequestMapping("/3_1_03A")
    public String get3_1_03A(){
        return "3_1_03a";
    }

    @RequestMapping("/3_1_04A")
    public String get3_1_04A(){
        return "3_1_04a";
    }

    @RequestMapping("/3_1_05A")
    public String get3_1_05A(){
        return "3_1_05a";
    }

    @RequestMapping("/3_2_1")
    public String get3_2_01A(){
        return "3_2_1";
    }

    @RequestMapping("/3_3_1")
    public String get3_3_01A(){
        return "3_3_1";
    }

    @RequestMapping("/3_6_1")
    public String get3_6_01A(){
        return "3_6_1";
    }

    @RequestMapping("/3_7_1")
    public String get3_7_01A(){
        return "3_7_1";
    }

    @RequestMapping("/3_8_1")
    public String get3_8_01A(){
        return "3_8_1";
    }

    @RequestMapping("/enterprise_dynamic")
    public String getEnterpriseDynamic(){
        return "enterprise_dynamic";
    }

    @RequestMapping("/jingpin")
    public String getJingPin(){
        return "jingpin";
    }
}
