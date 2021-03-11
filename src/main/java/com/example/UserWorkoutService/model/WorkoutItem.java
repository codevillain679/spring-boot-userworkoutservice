package com.example.UserWorkoutService.model;

public class WorkoutItem {

    private String id;

    public WorkoutItem(String id) {
        this.id = id;
    }

    public WorkoutItem() {
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
}
