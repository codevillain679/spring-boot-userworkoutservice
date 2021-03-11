package com.example.UserWorkoutService.controller;

import com.example.UserWorkoutService.model.User;
import com.example.UserWorkoutService.model.UserWorkout;
import com.example.UserWorkoutService.model.Workout;
import com.example.UserWorkoutService.model.WorkoutItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class UserWorkoutController {

    @GetMapping("/{userId}")
    public UserWorkout getUserWorkout(@PathVariable("userId") String userId){

        RestTemplate restTemplate = new RestTemplate();

        //get user with resp. user id
        User user = restTemplate.getForObject("http://localhost:8081/user/"+userId, User.class);

        List<WorkoutItem> workoutItems = user.getWorkoutItems();

        System.out.println(workoutItems.get(0).getId());

       // Workout workout = restTemplate.getForObject("http://localhost:8082/workout/"+workoutItems.get(0).getId(), Workout.class);


        List<Workout> workouts = new ArrayList<>();

        //get workouts for user
        for(int i = 0; i < workoutItems.size(); i++){
            Workout workout = restTemplate.getForObject("http://localhost:8082/workout/"+workoutItems.get(i).getId(), Workout.class);
            workouts.add(workout);
        }

        //add together and slap back to endpoint
        return new UserWorkout(user, workouts);
    }
}
