package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //given
        Set<Book> books = new HashSet<>();
        books.add(new Book("Michael Connelly","The Black Echo",1992,"1001"));
        books.add(new Book("Harlan Coben","The Woods",2008,"1002"));
        books.add(new Book("John Grisham","The Firm",1991,"1003"));
        books.add(new Book("Richard K. Morgan","Altered Carbon",2003,"1004"));
        books.add(new Book("Robin Cook","Vector",1999,"1005"));
        books.add(new Book("Alex Cava","The Soul Catcher",2003,"1006"));
        books.add(new Book("Philip K. Dicka","Do Androids Dream of Electric Sheep?",1968,"1007"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //when
        int median = medianAdapter.publicationYearMedian(books);
        //then
        System.out.println(median);
        assertEquals(median, 1999, 0);
    }
}
