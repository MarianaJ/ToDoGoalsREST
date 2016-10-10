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
    private long id;
    @Column
    private String description;
    @Column
    private LocalDateTime createdAt;
    @Column
    private LocalDateTime dueTo;
    @Column
    private boolean isCompleted;

    public Goal(String description, LocalDateTime dueTo) {
        this.description = description;
        this.createdAt = LocalDateTime.now();
        this.dueTo = dueTo;
        this.isCompleted = false;
    }

    public long getId() {
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

    public Goal(){

    }
}
