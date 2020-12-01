package dk.dd.carcatalog;

import com.mongodb.*;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

public class MongoHandler {
    private MongoClient mongoClient = new MongoClient();

    public String createMongoDBConnection(){
        // Creating a Mongo client
        MongoClient mongo = new MongoClient( "localhost" , 27017 );

        // Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("root", "car_ratings",
                "example".toCharArray());
        System.out.println("Connected to the database successfully");

        // Accessing the database
        MongoDatabase database = mongo.getDatabase("car_ratings");
        System.out.println("Credentials ::"+ credential);
        String name = database.getName();
        MongoIterable<String> strings = database.listCollectionNames();
        String first = strings.first();
        return first;
        /*
        MongoCredential credential = MongoCredential.createCredential("root", "car_ratings", "example1234".toCharArray());
        System.out.println(credential);
        MongoDatabase database = mongoClient.getDatabase("car_ratings");
        StringBuilder sb = new StringBuilder();
        for (String name : database.listCollectionNames()) {
            sb.append("\n").append(name);
            System.out.println(name);
        }
        mongoClient.close();

         */
        //return sb.toString();
    }
}
