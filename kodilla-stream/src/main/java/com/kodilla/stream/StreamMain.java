package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

//        Scanner scanner = new Scanner(System.in);
//        String sc= scanner.nextLine();
//        System.out.println("Wprowadziłeś: " + sc);

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("\nThis is sample text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("\nCalculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("\nCalculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("\nMaking text beautiful!");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String textBeauty = poemBeautifier.beautify(".Testowy tekst.",string ->"ABC" + string + "ABC");
        String textBeauty1 = poemBeautifier.beautify("Testowy tekst",string ->string.toUpperCase());
        String textBeauty2 = poemBeautifier.beautify("TESTOWY TEKST",string ->string.toLowerCase());
        String textBeauty3 = poemBeautifier.beautify("Testowy tekst",string ->string.replace('t','*'));
        System.out.println(textBeauty + "\n" + textBeauty1 + "\n" + textBeauty2 + "\n" + textBeauty3);

        System.out.println("\nUsing Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);

        System.out.println();
        //Kolektor Collectors.toList()
        BookDirectory theBookDirectory = new BookDirectory();
        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);

        System.out.println();
        //Kolektor Collectors.toMap()

        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

        System.out.println();
        //Kolektor Collectors.joining()
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);

        System.out.println();
        //Zadanie Submodule 7.3
        System.out.println("Zadanie Submodule 7.3");
        Forum theForumUsers = new Forum();
        Map<String, ForumUser> theResultStringOfUsers = theForumUsers.getList().stream()
                .filter(forumUser -> forumUser.getUserSex()=='M')
                .filter(forumUser -> forumUser.getUserDateOfBirth().getYear() > 1998)
                .filter(forumUser -> forumUser.getPublishedPostsCount() > 1)
                .collect(Collectors.toMap(ForumUser::getForumId, forumUser -> forumUser));
        System.out.println("# ForumUsers: " + theResultStringOfUsers.size());
        theResultStringOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);
    }
}
