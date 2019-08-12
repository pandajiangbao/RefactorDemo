package rentalstore;

public class ChildrenMovie extends MovieType {
    @Override
    double getAmount(int getDayRented) {
        double thisAmount = 0;
        thisAmount += 1.5;
        if (getDayRented > 3) {
            thisAmount += (getDayRented - 3) * 1.5;
        }
        return thisAmount;
    }

    @Override
    int getFrequentRenterPoint(Rental rental) {
        return 1;
    }
}
