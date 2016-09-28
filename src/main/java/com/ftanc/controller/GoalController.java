package com.ftanc.controller;

import com.ftanc.model.Goal;
import com.ftanc.service.GoalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by ftanc on 25/09/2016.
 */
@RequestMapping("/goal")
@RestController
public class GoalController {
    private GoalService goalService;

    @Autowired
    @Qualifier(value = "goalService")
    public void setGoalService(GoalService goalService){
        this.goalService = goalService;
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public Goal findGoal(){

    }
}
