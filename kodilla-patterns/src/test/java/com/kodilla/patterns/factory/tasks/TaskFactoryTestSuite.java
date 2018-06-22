package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        //Then
        Assert.assertEquals("Grocery", shopping.getTaskName());
        Assert.assertTrue(shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        //Then
        Assert.assertEquals("Painting for Animal", painting.getTaskName());
        Assert.assertTrue(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        //Then
        Assert.assertEquals("Mrs. Daisy", driving.getTaskName());
        Assert.assertTrue(driving.isTaskExecuted());
    }
}
