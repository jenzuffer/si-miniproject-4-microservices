package controllers;

import models.Rating;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/rating")
public class RatingController {
    @PostMapping("")
    public boolean postCarRating(@RequestBody Rating rating) { return false;}

    @GetMapping("")
    public Collection<Rating> getCarRatings() { return new ArrayList<Rating>(); }
}
