package org.fundacionjala.movies;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Pedro");
        customer.addRental(new Rental(new Regular("Terminator"), 2));
        customer.addRental(new Rental(new Release("Suicide Squad"), 2));
        customer.addRental(new Rental(new Childrens("Dory"), 2));
        System.out.println(customer.statement());
    }
}
