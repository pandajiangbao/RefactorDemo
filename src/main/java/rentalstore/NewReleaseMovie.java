package rentalstore;

public class NewReleaseMovie extends MovieType {

    @Override
    double getAmount(int getDayRented) {
        double thisAmount = 0;
        thisAmount += getDayRented * 3;
        return thisAmount;
    }

    @Override
    int getFrequentRenterPoint(Rental rental) {
        if (rental.getDayRented() > 1) {
            return 2;
        }
        return 1;
    }
}
