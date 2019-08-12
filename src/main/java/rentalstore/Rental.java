package rentalstore;

public class Rental {
    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    Movie getMovie() {
        return movie;
    }

    int getDayRented() {
        return dayRented;
    }

    double getThisAmount(MovieType movieType) {
        return movieType.getAmount(getDayRented());
    }

    int getFrequentRenterPoints() {
        if ((this.getMovie().getMovieType().getClass()==NewReleaseMovie.class) && getDayRented() > 1) {
            return 2;
        }
        return 1;
    }
}
