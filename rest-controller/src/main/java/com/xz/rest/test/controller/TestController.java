package com.xz.rest.test.controller;

import com.xz.rest.test.service.StringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gg")
public class TestController {

    @Autowired
    private StringService service;

    @GetMapping
    public String test() {
        return service.get();
    }
}
