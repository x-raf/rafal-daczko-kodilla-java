package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] numbers = new int[20];
        for (int i = 1; i < 20; i++) {
            numbers[i] = i;
        }
        //When
        double average = ArrayOperations.getAverage(numbers);
        //Then
        Assert.assertEquals(9.5, average, 0.001);
    }
}
