package rentalstore;

class TextStatement extends Statement  {

    @Override
    String headerString(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    @Override
    String eachRentalString(Rental rental) {
        return "\t" + rental.getMovie().getTitle() + "\t" +
                String.valueOf(rental.getThisAmount(rental.getMovie().getMovieType())) + "\n";
    }

    @Override
    String footerString(Customer customer) {
        return "Amount owed is " + customer.getTotalAmount() + "\n" +
                "You earned " + customer.getTotalFrequentRenterPoints() +
                " frequent renter points";
    }
}
