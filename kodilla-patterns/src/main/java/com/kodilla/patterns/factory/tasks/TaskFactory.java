package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {
    public static final String SHOPPINGTASK = "SHOPPINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String DRIVINGTASK = "DRIVINGTASK";

    public final Task makeTask(final String taskClass){
        switch (taskClass){
            case SHOPPINGTASK:
                return new ShoppingTask("Grocery", "butter", 1);
            case PAINTINGTASK:
                return new PaintingTask("Painting for Animal","brown","dog house");
            case DRIVINGTASK:
                return new DrivingTask("Mrs. Daisy","home","by car");
            default:
                return null;
        }
    }
}
