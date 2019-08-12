package rentalstore;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;
    private MovieType movieType;

    public Movie(String title, int priceCode) {
        this.title = title;
        if(priceCode==0){
            this.setMovieType(new RegularMovie());
        }else if(priceCode==1){
            this.setMovieType(new NewReleaseMovie());
        }else if(priceCode==2){
            this.setMovieType(new ChildrenMovie());
        }
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public int getPriceCode() {
        return priceCode;
    }


    public String getTitle() {
        return title;
    }

}
