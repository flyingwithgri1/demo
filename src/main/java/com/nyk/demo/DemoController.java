package com.nyk.demo;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        log.info("log is success");
        return "success! luck!";
    }
}
