package com.ftanc.repository;

import com.ftanc.model.Goal;

import java.util.List;

/**
 * Created by ftanc on 25/09/2016.
 */
interface GoalRepository {
    void addGoal(Goal goal);
    void updateGoal(Goal goal);
    List<Goal> listAllGoals();
    Goal getGoalById(int id);
    void deleteGoal(int id);
}
