package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
    
    
    @RequestMapping("firstDemo")
    public  String   firstDemo(){


        String successs = "successs";
        return successs;
    }
}
