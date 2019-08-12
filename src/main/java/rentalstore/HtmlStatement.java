package rentalstore;

class HtmlStatement extends Statement {
    @Override
    String headerString(Customer customer) {
        return "<H1>Rentals for <EM>" + customer.getName() + "</EM></H1><P>\n";
    }

    @Override
    String eachRentalString(Rental rental) {
        return rental.getMovie().getTitle() + ": " + String.valueOf(rental.getThisAmount(rental.getMovie().getMovieType())) + "<BR>\n";
    }

    @Override
    String footerString(Customer customer) {
        return "<P>You owe<EM>" + String.valueOf(customer.getTotalAmount()) + "</EM><P>\n"
                + "On this rental you earned <EM>" + String.valueOf(customer.getTotalFrequentRenterPoints()) +
                "</EM> frequent renter points<P>";
    }
}
