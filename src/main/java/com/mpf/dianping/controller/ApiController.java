package com.mpf.dianping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class ApiController {
    @GetMapping(value = "/homead")
    public List<String> homead() throws Exception{
        return new ArrayList<>();
    }
}
