package com.vivolvle.abstract_factory.controller;

import com.vivolvle.abstract_factory.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weilz
 * @date 2019/8/2
 */
@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }

    @GetMapping("/iocFactory/{type}")
    public void iocFactory(@PathVariable("type") Integer type){
        testService.iocFactoryMethod(type);
    }
}
