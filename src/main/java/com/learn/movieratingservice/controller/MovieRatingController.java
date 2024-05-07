package com.learn.movieratingservice.controller;

import com.learn.movieratingservice.model.Rating;
import com.learn.movieratingservice.model.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/ratingsdata")
public class MovieRatingController {

        @RequestMapping("/{movieId}")
        public Rating getRating(@PathVariable("movieId") String movieId) {
            return new Rating("Raja Huli",10);
        }

        @GetMapping("users/{userId}")
        public UserRating getRatingsOfAUser(@PathVariable("userId") String userId){
            List<Rating> ratings = Arrays.asList(new Rating("1234", 5), new Rating("5678", 2));
            UserRating userRating = new UserRating();
            userRating.setRatings(ratings);
            return userRating;
        }
}
