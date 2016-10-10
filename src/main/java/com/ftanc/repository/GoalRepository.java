package com.ftanc.repository;

import com.ftanc.model.Goal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ftanc on 10/10/2016.
 */
@Repository(value = "goalRepository")
public interface GoalRepository extends JpaRepository<Goal, Long> {
}
