package com.ftanc.service;

import com.ftanc.model.Goal;

import java.util.List;

/**
 * Created by ftanc on 28/09/2016.
 */
public interface GoalService {
    void addGoal(Goal goal);
    void updateGoal(Goal goal);
    List<Goal> listAllGoals();
    Goal getGoalById(int id);
    void removeGoal(int id);
}
