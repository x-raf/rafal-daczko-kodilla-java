package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExercisesQueueTestSuit {
    @Test
    public void testUpdate() {
        //Given
        Mentor jamesGosling = new Mentor("James Gosling");
        Mentor stevenBuchalka = new Mentor("Steven Buchalka");

        StudentExerciseQueue johnSmith = new StudentExerciseQueue("John Smith");
        StudentExerciseQueue joeDoe = new StudentExerciseQueue("Joe Doe");
        StudentExerciseQueue emilyPerkins = new StudentExerciseQueue("Emily Perkins");
        StudentExerciseQueue annNewton = new StudentExerciseQueue("Ann Newton");

        johnSmith.registerMentor(jamesGosling);
        joeDoe.registerMentor(jamesGosling);
        emilyPerkins.registerMentor(stevenBuchalka);
        annNewton.registerMentor(stevenBuchalka);

        //When
        johnSmith.addExercise("Singelton");
        johnSmith.addExercise("Builder");
        joeDoe.addExercise("Factory");
        joeDoe.addExercise("Facade");
        emilyPerkins.addExercise("Observer");
        annNewton.addExercise("Decorator");

        //Then
        assertEquals(4,jamesGosling.getUpdateCount());
        assertEquals(2,stevenBuchalka.getUpdateCount());
    }
}
