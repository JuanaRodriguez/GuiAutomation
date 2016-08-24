package org.fundacionjala.movies;

/**
 * Created by JuanaRodriguez on 8/24/2016.
 */
public class Release extends Movie{
    public Release(String title) {
        super(title);
    }
    public double calculateAmount(int daysRented) {
        return daysRented * 3.0;
    }

    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}
