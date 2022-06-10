package student_arturs_melnikovs.lesson_15.level_06;

import java.util.Enumeration;
import java.util.Vector;

class Customer {

    private final String name;
    private final Vector<Rental> rentals = new Vector<>();

    public Customer(String name) {
        this.name = name;
    }

    public String statement() {
        String statement = "Rental Record for " + getName() + "\n";
        double totalPrice = 0;
        int loyaltyPoints = 0;
        Enumeration<Rental> rentals = this.rentals.elements();
        while (rentals.hasMoreElements()) {
            Rental rental = rentals.nextElement();
            double price = calculateMoviePrice(rental);
            loyaltyPoints += calcLoyaltyPoints(rental);
            statement += "\t" + rental.getMovie().getTitle() + "\t"
                    + price + "\n";
            totalPrice += price;
        }
        statement += "You owed " + totalPrice + "\n";
        statement += "You earned " + loyaltyPoints + " frequent renter points\n";
        return statement;
    }

    private int calcLoyaltyPoints(Rental rental) {
        int loyaltyPoints = 1;
        if (rental.getMovie().getPriceCode().equals(Movie.NEW_RELEASE)
                && rental.getDaysRented() > 1) {
            loyaltyPoints++;
        }
        return loyaltyPoints;
    }

    private double calculateMoviePrice(Rental rental) {
        double price = 0;
        switch (rental.getMovie().getPriceCode()) {
            case Movie.REGULAR -> price = regularPrice(price, rental);
            case Movie.NEW_RELEASE -> price = newReleasePrice(rental);
            case Movie.CHILDRENS -> price = childrenPrice(price, rental);
        }
        return price;
    }

    private double newReleasePrice(Rental rental) {
        return rental.getDaysRented() * 3;
    }

    private double childrenPrice(double price, Rental rental) {
        price += 1.5;
        if (rental.getDaysRented() > 3)
            price += (rental.getDaysRented() - 3) * 1.5;
        return price;
    }

    private double regularPrice(double price, Rental rental) {
        price += 2;
        if (rental.getDaysRented() > 2)
            price += (rental.getDaysRented() - 2) * 1.5;
        return price;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }


}