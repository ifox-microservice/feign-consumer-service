package com.ifox.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ifox.service.CalculateClient;

@RestController
public class ConsumerController {
    @Autowired
    private CalculateClient calculateClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add() {
        return calculateClient.add(10, 20);
    }
}
