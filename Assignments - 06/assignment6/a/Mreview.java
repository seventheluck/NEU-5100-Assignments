package assignments.assignment6.a;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview> {

    private String title;   // title of the movie
    private ArrayList<Integer> ratings; // list of ratings stored in a Store object

    public Mreview() {
        this.title = "";
        this.ratings = new ArrayList<Integer>();
    }

    public Mreview(String ttl) {
        this.title = ttl;
        this.ratings = new ArrayList<Integer>();
    }

    public Mreview(String ttl, int firstRating) {
        this.title = ttl;
        if (this.ratings == null) {
            this.ratings = new ArrayList<Integer>();
            this.ratings.add(firstRating);
        }
    }

    public String getTitle() {
        return this.title;
    }

    public void addRating(int r) {
        this.ratings.add(r);
    }

    public double aveRating() {
        double ave = 0;
        double sum = 0;
        for (int i = 0; i < this.ratings.size(); i++) {
            sum += (double) ratings.get(i);
        }
        ave = sum / this.ratings.size();
        if (this.ratings.size() == 0) {
            return 0.00;
        } else {

            return (Math.round(ave * 100) / 100.00);
        }
    }

    public int numRatings() {
        return this.ratings.size();
    }


    @Override
    public int compareTo(Mreview anotherMreview) {
        if (anotherMreview != null) {
            return this.title.compareTo(anotherMreview.getTitle());
        } else {
            return -1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            Mreview anotherMreview = (Mreview) obj;
            if (this.title.equals(anotherMreview.getTitle())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String result = "";
        String title = this.title;
        if (title.equals("")) {
            title = "Anonymous film";
        }
        if (this.numRatings() == 0) {
            result = title + ", average none out of 0 ratings";
        } else {
            result = title + ", average " + this.aveRating() + " out of " + this.numRatings() + " ratings";
        }
        return result;
    }
}
