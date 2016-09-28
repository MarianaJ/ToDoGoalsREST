package com.ftanc.repository;

import com.ftanc.model.Goal;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by ftanc on 25/09/2016.
 */
@Repository
public class GoalRepositoryImpl implements GoalRepository {


    private SessionFactory sessionFactory;
    @Override
    public void addGoal(Goal goal) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(goal);
    }

    @Override
    public void updateGoal(Goal goal) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(goal);
    }

    @Override
    public List<Goal> listAllGoals() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Goal> goalsList = session.createQuery("FROM Goal").list();
        return goalsList;
    }

    @Override
    public Goal getGoalById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        return (Goal) session.load(Goal.class, id);
    }

    @Override
    public void removeGoal(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Goal goal = (Goal) session.load(Goal.class, id);
        if(null != goal) {
            session.delete(goal);
        }
    }
}
