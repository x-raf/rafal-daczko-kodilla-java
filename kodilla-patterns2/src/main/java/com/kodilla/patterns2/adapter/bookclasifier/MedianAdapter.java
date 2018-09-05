package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter  extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book>
                bookMap = new HashMap<>();
        List<Book> books = new ArrayList<>();
        books.addAll(bookSet);
        for (int n = 0; n < books.size(); n++) {
            bookMap.put(new BookSignature(books.get(n).getSignature()),
                    new com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book(
                            books.get(n).getAuthor(),
                            books.get(n).getTitle(),
                            books.get(n).getPublicationYear()));
        }
        return medianPublicationYear(bookMap);
    }
}
