package dk.dd.carcatalog;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/rating")
public class RatingController {
    private MongoHandler mh = new MongoHandler();
    @PostMapping("")
    public boolean postCarRating(@RequestBody Rating rating) { return mh.insertRatingIntoCollection(rating);}

    @GetMapping("")
    public String getCarRatings() { return mh.getRatingCollection("ratings"); }

    @GetMapping("/collections")
    public String getCollections(){return mh.createMongoDBConnection();}
}
