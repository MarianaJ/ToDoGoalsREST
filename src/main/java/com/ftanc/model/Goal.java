package com.ftanc.model;


/**
 * Created by ftanc on 25/09/2016.
 */
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Goals")
public class Goal {

    @Id
    @GeneratedValue
    private int id;
    @Column(name = "description")
    private String description;
    @Column(nullable = false, name = "createdAt")
    private LocalDateTime createdAt;
    @Column(name = "dueTo")
    private LocalDateTime dueTo;
    @Column(name = "isCompleted")
    private boolean isCompleted = false;

    public Goal(int id, String description, LocalDateTime createdAt, LocalDateTime dueTo, boolean isCompleted) {
        this.id = id;
        this.description = description;
        this.createdAt = createdAt;
        this.dueTo = dueTo;
        this.isCompleted = isCompleted;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getDueTo() {
        return dueTo;
    }

    public void setDueTo(LocalDateTime dueTo) {
        this.dueTo = dueTo;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
