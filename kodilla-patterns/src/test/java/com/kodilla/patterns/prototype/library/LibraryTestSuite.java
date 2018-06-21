package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Library library = new Library("BookList");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Book number: " + n, "Author number: "
                        + n, LocalDate.of(1999,8,1).minusYears(n))));
        Book myBook = new Book("Book number: " + 1, "Author number: "
                + 1, LocalDate.of(1999,8,1).minusYears(1));
        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Book list 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Book list 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        library.getBooks().remove(myBook);
        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        Assert.assertEquals(9, library.getBooks().size());
        Assert.assertEquals(9, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
    }
}
