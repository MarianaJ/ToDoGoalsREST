package com.ftanc.controller;

import com.ftanc.model.Goal;
import com.ftanc.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.orm.hibernate4.HibernateJdbcException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by ftanc on 25/09/2016.
 */
@RequestMapping("/api/v1")
@RestController
public class GoalController {

    @Autowired
    private GoalRepository goalRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Goal> listAllGoals(){
        return goalRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    @ResponseBody
    public String addNewGoal(){
        Goal goal;
        String description = "Dupa Jas";
        try{
            goal = new Goal(description, LocalDateTime.now());
            goalRepository.save(goal);
        }catch (HibernateJdbcException e){
            return "Goal not created" + e.getSql();
        }
        return "Goal created" + goal.getId();
    }
}
