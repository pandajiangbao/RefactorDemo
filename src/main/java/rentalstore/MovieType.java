package rentalstore;

public abstract class MovieType {
    abstract double getAmount(int getDayRented);
    abstract int getFrequentRenterPoint(Rental rental);
}
