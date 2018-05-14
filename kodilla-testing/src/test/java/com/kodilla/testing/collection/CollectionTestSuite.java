package com.kodilla.testing.collection;

import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }
    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        ArrayList<Integer> myList = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        if(myList.size() ==0){
            System.out.println("Testing: Lista jest pusta!");
        }
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(myList);
        //Then
        ArrayList<Integer> properList = new ArrayList<>();
        Assert.assertEquals(properList, resultList);
    }
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i=0; i<20; i++){
            Integer number = i +1;
            myList.add(number);
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        ArrayList<Integer> resultList = oddNumbersExterminator.exterminate(myList);
        System.out.println("Testing: " + resultList);
        //Then
        ArrayList<Integer> properList = new ArrayList<>();
        properList.add(2);
        properList.add(4);
        properList.add(6);
        properList.add(8);
        properList.add(10);
        properList.add(12);
        properList.add(14);
        properList.add(16);
        properList.add(18);
        properList.add(20);
        Assert.assertEquals(properList, resultList);
    }
}
