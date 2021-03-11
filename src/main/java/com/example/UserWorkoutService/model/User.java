package com.example.UserWorkoutService.model;

import java.util.List;

public class User {
    private String name;
    private String bio;
    private List<WorkoutItem> workoutItems;

    public User() {
    }

    public User(String name, String bio, List<WorkoutItem> workoutItems) {
        this.name = name;
        this.bio = bio;
        this.workoutItems = workoutItems;
    }

    public List<WorkoutItem> getWorkoutItems() {
        return workoutItems;
    }

    public void setWorkouts(List<WorkoutItem> workoutItem) {
        this.workoutItems = workoutItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
