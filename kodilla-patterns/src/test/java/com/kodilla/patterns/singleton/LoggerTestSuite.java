package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void saveToLog() {
        Logger.getInstance().log("Test action saving to log");
    }
    @Test
    public void testGetLastLog() {
        //Given
        //When
        String lastLog = Logger.getInstance().getLastLog();
        System.out.println("Last line in log: " + lastLog);
        //Then
        Assert.assertEquals("Test action saving to log", lastLog);
    }
}
