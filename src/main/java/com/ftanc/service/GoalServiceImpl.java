package com.ftanc.service;

import com.ftanc.model.Goal;
import com.ftanc.repository.GoalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ftanc on 28/09/2016.
 */
@Service
public class GoalServiceImpl implements GoalService {

    private GoalRepository goalRepository;

    public void setGoalRepository(GoalRepository goalRepository){
        this.goalRepository = goalRepository;
    }

    @Override
    public void addGoal(Goal goal) {
        this.goalRepository.addGoal(goal);
    }

    @Override
    public void updateGoal(Goal goal) {
        this.goalRepository.updateGoal(goal);
    }

    @Override
    public List<Goal> listAllGoals() {
        return this.goalRepository.listAllGoals();
    }

    @Override
    public Goal getGoalById(int id) {
        return this.goalRepository.getGoalById(id);
    }

    @Override
    public void removeGoal(int id) {
        this.goalRepository.removeGoal(id);
    }
}
