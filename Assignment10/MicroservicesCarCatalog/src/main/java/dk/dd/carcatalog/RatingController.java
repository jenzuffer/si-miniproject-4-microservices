package dk.dd.carcatalog;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;

@RestController
@RequestMapping("/rating")
public class RatingController {
    private MongoHandler mh = new MongoHandler();
    @PostMapping("")
    public boolean postCarRating(@RequestBody Rating rating) { return false;}

    @GetMapping("")
    public Collection<Rating> getCarRatings() { return new ArrayList<Rating>(); }

    @GetMapping("/collections")
    public String getCollections(){return mh.createMongoDBConnection();}
}
