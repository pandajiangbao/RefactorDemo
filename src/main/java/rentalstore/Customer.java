package rentalstore;

import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Rental> rentals = new ArrayList<>();

    Customer(String name) {
        this.name = name;
    }

    void addRental(Rental arg) {
        rentals.add(arg);
    }

    String getName() {
        return name;
    }

    List<Rental> getRentals() {
        return rentals;
    }

    String statement() {
        return new TextStatement().value(this);
    }

    String htmlStatement(){
        return new HtmlStatement().value(this);
    }

    double getTotalAmount() {
        return this.rentals.stream().mapToDouble(item->item.getThisAmount(item.getMovie().getMovieType())).sum();
    }

    int getTotalFrequentRenterPoints() {
        return this.rentals.stream().mapToInt(Rental::getFrequentRenterPoints).sum();
    }

}
