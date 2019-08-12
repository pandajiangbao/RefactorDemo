package rentalstore;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer=new Customer("Panda");

    @Test
    public void should_return_correct_statement_given_customer_has_no_rental(){
        //given

        //when
        String statement = customer.statement();

        //then
        assertEquals("Rental Record for Panda\nAmount owed is 0.0\nYou earned 0 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_regular_movie_for_1_day() {
        //given
        Movie movie = new Movie("复仇者联盟", Movie.REGULAR);
        Rental rental = new Rental(movie, 1);
        customer.addRental(rental);

        //when
        String statement = customer.statement();

        //then
        assertEquals("Rental Record for Panda\n" +
                "\t" + movie.getTitle() + "\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_regular_movie_for_3_day() {
        //given
        Movie regularMovie = new Movie("复仇者联盟", Movie.REGULAR);
        Rental rental = new Rental(regularMovie, 3);
        customer.addRental(rental);

        //when
        String statement = customer.statement();

        //then
        assertEquals("Rental Record for Panda\n" +
                "\t" + regularMovie.getTitle() + "\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_new_release_movie_for_1_day() {
        //given
        Movie newReleaseMovie = new Movie("哪吒", Movie.NEW_RELEASE);
        Rental rental = new Rental(newReleaseMovie, 1);
        customer.addRental(rental);

        //when
        String statement = customer.statement();

        //then
        assertEquals("Rental Record for Panda\n" +
                "\t" + newReleaseMovie.getTitle() + "\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_new_release_movie_for_2_day() {
        //given
        Movie newReleaseMovie = new Movie("哪吒", Movie.NEW_RELEASE);
        Rental rental = new Rental(newReleaseMovie, 2);
        customer.addRental(rental);

        //when
        String statement = customer.statement();

        //then
        assertEquals("Rental Record for Panda\n" +
                "\t" + newReleaseMovie.getTitle() + "\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_child_movie_for_1_day() {
        Movie childrenMovie = new Movie("喜羊羊", Movie.CHILDRENS);
        Rental oneDayRental = new Rental(childrenMovie, 1);
        customer.addRental(oneDayRental);

        String statement = customer.statement();

        assertEquals("Rental Record for Panda\n" +
                "\t" + childrenMovie.getTitle() + "\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_statement_given_customer_has_rent_one_child_movie_for_4_day() {
        Movie childrenMovie = new Movie("喜羊羊", Movie.CHILDRENS);
        Rental fourDayRental = new Rental(childrenMovie, 4);
        customer.addRental(fourDayRental);

        String statement = customer.statement();

        assertEquals("Rental Record for Panda\n" +
                "\t" + childrenMovie.getTitle() + "\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", statement);
    }

    @Test
    public void should_return_correct_html_statement_given_customer_has_rent_two_new_release_movie_for_1_day() {
        Movie movie1 = new Movie("Roman Holiday", Movie.NEW_RELEASE);
        Rental rental1 = new Rental(movie1, 1);
        customer.addRental(rental1);

        Movie movie2 = new Movie("Titanic", Movie.NEW_RELEASE);
        Rental rental2 = new Rental(movie2, 1);
        customer.addRental(rental2);

        String statement = customer.htmlStatement();

        System.out.println(statement);

        assertEquals("<H1>Rentals for <EM>Panda</EM></H1><P>\n" +
                "Roman Holiday: 3.0<BR>\n" +
                "Titanic: 3.0<BR>\n" +
                "<P>You owe<EM>6.0</EM><P>\n" +
                "On this rental you earned <EM>2</EM> frequent renter points<P>", statement);
    }
}
