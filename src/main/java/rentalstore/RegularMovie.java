package rentalstore;

public class RegularMovie extends MovieType {

    @Override
    double getAmount(int getDayRented) {
        double thisAmount = 0;
        thisAmount += 2;
        if (getDayRented > 2) {
            thisAmount += (getDayRented - 2) * 1.5;
        }
        return thisAmount;
    }

    @Override
    int getFrequentRenterPoint(Rental rental) {
        return 1;
    }
}
