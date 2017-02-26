package com.grantmagdanz.rest.controllers;

import com.grantmagdanz.rest.pojos.Greeting;
import com.grantmagdanz.rest.services.FortuneService;
import com.grantmagdanz.rest.pojos.Fortune;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private FortuneService fortuneService;

    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

    @RequestMapping(value="/fortune", method=RequestMethod.GET)
    public Fortune fortune() {
        return new Fortune(fortuneService.getFortune());
    }
}
