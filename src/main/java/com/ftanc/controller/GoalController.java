package com.ftanc.controller;

import com.ftanc.model.Goal;
import com.ftanc.repository.GoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.orm.hibernate4.HibernateJdbcException;
import org.springframework.web.bind.annotation.*;

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
    public List<Goal> getAllGoals() {
        return goalRepository.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public String addNewGoal() {
        Goal goal;
        String description = "Chyab dziala";
        try {
            goal = new Goal(description, LocalDateTime.now());
            goalRepository.save(goal);
        } catch (HibernateJdbcException e) {
            return "Something went wrong " + e.getSql();
        }
        return "Goal created" + goal.getId();
    }

    @RequestMapping(value = "/get/{goalId}", method = RequestMethod.GET)
    public Goal getOneGoal(@PathVariable Long goalId) {
        return goalRepository.findOne(goalId);
    }

    @RequestMapping(value = "/remove/{goalId}", method = RequestMethod.DELETE)
    public String removeGoal(@PathVariable Long goalId){
        try {
            goalRepository.delete(goalId);
        }catch (HibernateJdbcException e){
            return "Something went wrong, sorry";
        }
        return "Goal " + goalId + " was removed";
    }
}
