package com.ricemarch.githubactionsexamples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Description: githubactions-examples
 * Created by Rice on 2020/6/29 17:45
 */
@Controller
@RequestMapping("/api/")
public class MyController {

    @GetMapping("name")
    public Map test() {
        return Map.of("name", "Rice");
    }


}
