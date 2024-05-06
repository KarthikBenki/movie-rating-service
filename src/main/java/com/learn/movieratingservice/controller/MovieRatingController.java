package com.learn.movieratingservice.controller;

import com.learn.movieratingservice.model.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsdata")
public class MovieRatingController {

        @RequestMapping("/{movieId}")
        public Rating getRating(@PathVariable("movieId") String movieId) {
            return new Rating("Raja Huli",10);
        }
}
