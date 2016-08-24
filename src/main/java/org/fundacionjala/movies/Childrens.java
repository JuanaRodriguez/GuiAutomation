package org.fundacionjala.movies;

/**
* Created by JuanaRodriguez on 8/24/2016.
*/
public class Childrens extends Movie {

    public Childrens(String title) {
        super(title);
    }

    public double calculateAmount(int daysRented) {
        double thisAmount = 1.5;
        if (daysRented > 3)
            thisAmount += (daysRented - 3) * 1.5;
        return thisAmount;
    }
    public int calculateFrequentRenterPoints(int daysRented){

       return 1;
    }

}
