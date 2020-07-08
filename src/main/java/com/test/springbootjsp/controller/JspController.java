package com.test.springbootjsp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class JspController {

    @GetMapping("/{page}")
    public String finds(@PathVariable String page){
        System.out.println(page);
        return page;
    }
}
