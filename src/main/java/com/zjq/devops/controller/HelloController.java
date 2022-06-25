package com.zjq.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author admin
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){


        return "Hello Java DevOps!!!  66666";
    }


}
