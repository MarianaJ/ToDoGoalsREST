package com.ftanc.repository;

import com.ftanc.model.Goal;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ftanc on 25/09/2016.
 */
@Repository
public class GoalRepositoryImpl implements GoalRepository {

    @Override
    public void addGoal(Goal goal) {

    }

    @Override
    public void updateGoal(Goal goal) {

    }

    @Override
    public List<Goal> listAllGoals() {
        return null;
    }

    @Override
    public Goal getGoalById(int id) {
        return null;
    }

    @Override
    public void deleteGoal(int id) {

    }
}
