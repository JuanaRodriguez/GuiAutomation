package org.fundacionjala.movies;

public abstract class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;

    public Movie(String title) {
        this.title = title;
    }

    public abstract double calculateAmount(int daysRented);
    public abstract int calculateFrequentRenterPoints(int daysRented);

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    public String getTitle() {
        return title;
    }
}
