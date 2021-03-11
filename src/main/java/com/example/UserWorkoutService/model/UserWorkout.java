package com.example.UserWorkoutService.model;

import java.util.List;

public class UserWorkout {

    private User user;
    private List<Workout> workouts;

    public UserWorkout(User user, List<Workout> workouts) {
        this.user = user;
        this.workouts = workouts;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
    }
}
