package com.ftanc.controller;

import com.ftanc.model.Goal;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ftanc on 25/09/2016.
 */
@RequestMapping("/goal")
@RestController
public class GoalController {
    private static final String template = "Hello, %s!";
    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping(value = "/find", method = RequestMethod.GET)
    public Goal findGoal(@RequestParam(value = "name", defaultValue = "World") String name){
        return new Goal(counter.incrementAndGet(),
                        String.format(template, name));
    }
}
