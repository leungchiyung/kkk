package com.example.kkk.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ni")

public class ctl {
    @RequestMapping("/hao")
    public String nihao() {
        return "nihaozhiyongnnnzzz";
    }
}




