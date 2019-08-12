package rentalstore;

import java.util.Enumeration;

abstract class Statement {
    String value(Customer customer) {
        StringBuilder result = new StringBuilder(headerString(customer));
        for (Rental each : customer.getRentals()){
            result.append(eachRentalString(each));
        }
        result.append(footerString(customer));
        return result.toString();
    }

    abstract String headerString(Customer customer);

    abstract String eachRentalString(Rental rental);

    abstract String footerString(Customer customer);
}
