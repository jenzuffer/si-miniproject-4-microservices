package models;

public class Rating {
    private long carID;
    private int userID;
    private int rating;

    public Rating(long carID, int userID, int rating) {
        this.carID = carID;
        this.userID = userID;
        this.rating = rating;
    }

    public long getCarID() {
        return this.carID;
    }

    public void setCarID(long carID) {
        this.carID = carID;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getRating(){
        return this.rating;
    }

    public void setRating(int rating){
        this.rating = rating;
    }
}
