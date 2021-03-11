package com.example.UserWorkoutService.model;

public class Workout {
    private String name;
    private String desc;
    private String workoutId;

    public Workout(String name, String desc, String workoutId) {
        this.name = name;
        this.desc = desc;
        this.workoutId = workoutId;
    }

    public Workout() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getWorkoutId() {
        return workoutId;
    }

    public void setWorkoutId(String workoutId) {
        this.workoutId = workoutId;
    }
}
