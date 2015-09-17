package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    String format = String.format("%-20S%-20S%-20S", "Head First Java", "Bert Bates", 2009);

    @Test
    public void shouldReturnThePreExistingListOfBooks() {
        Library library = new Library();
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "--------------------------------------------------------------------";

        assertEquals(line + "\n" + header + "\n" + line + "\n" + format, library.toString());
    }

    User user = new User("B09-1893", "B091893", "Librarian", "Maharjun", "maharjun123@gmail.com", "8498984842");

    @Test
    public void shouldReturnTheThankYouWhenChooseAvailableBook() {
        Library library = new Library();

        assertEquals("Thank you! Enjoy the book", library.checkedOut("Head First Java", user));
    }

    @Test
    public void shouldReturnTheInvalidMessageWhenChooseUnavailableBook() {
        Library library = new Library();

        assertEquals("That book is not available.", library.checkedOut("Maharjun", user));
    }

    @Test
    public void shouldReturnTheInvalidMessageWhenWeWantToReturnInvalidBook() {
        Library library = new Library();

        assertEquals("That is not a valid book to return.", library.returnBook("Maharjun"));
    }

    @Test
    public void shouldReturnTheListOfMovies() {
        String line = "---------------------------------------------------------------------------------";
        String header = String.format("%-20S%-20S%-20S%-20S", "Movie Name", "Year It Released ", "Direactor", "Rating of The Movie");
        String movie1 = String.format("%-20S%-20S%-20S%-20S", "3 Idiots", 2009, "Rajkumar Hirani", 8.5);
        String movie2 = String.format("%-20S%-20S%-20S%-20S", "PK", 2014, "Rajkumar Hirani", 8.3);
        Library library = new Library();

        assertEquals(library.listMovies(), line + "\n" + header + "\n" + line + "\n" + movie1 + "\n" + movie2);
    }

    @Test
    public void shouldReturnTheInvalidMessageWhenWeWantCheckOutInvalidMovie() {
        Library library = new Library();

        assertEquals(library.checkedOutMovie("Maharjun"), "That movie is not available.");
    }

    @Test
    public void shouldReturnTheThankYouWhenWeWantCheckOutValidMovie() {
        Library library = new Library();

        assertEquals(library.checkedOutMovie("3 Idiots"), "Thank you! Enjoy the movie");
    }

    @Test
    public void shouldReturnTheCheckoutList() {
        Library library = new Library();
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "--------------------------------------------------------------------";
        assertEquals(library.checkedOutList(), line + "\n" + header + "\n" + line);
    }

    @Test
    public void shouldReturnTheCheckoutListValuesWhenBooksAreAvialable() {
        Library library = new Library();
        library.checkedOut("Head First Java", user);
        String header = String.format("%-20S%-20S%-20S", "Book Name", "Author Name", "Year Published");
        String line = "--------------------------------------------------------------------";
        assertEquals(library.checkedOutList(), line + "\n" + header + "\n" + line + "\n" + format + "\t" + user.toString());
    }
}
