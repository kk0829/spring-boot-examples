package com.example.buildingwithmaven;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kk
 * @date 2020-11-14 11:05
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }
}
