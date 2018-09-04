package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentExerciseQueue implements MentorObservable{
    private final List<ExerciseQueueObserver> mentors;
    private final List<String> exercises;
    private final String studentName;

    public StudentExerciseQueue(String studentName) {
        mentors = new ArrayList<>();
        exercises = new ArrayList<>();
        this.studentName = studentName;
    }
    public void addExercise(String exercise) {
        exercises.add(exercise);
        notifyMentors();
    }

    @Override
    public void registerMentor(ExerciseQueueObserver exerciseQueueObserver) {
        mentors.add(exerciseQueueObserver);
    }

    @Override
    public void notifyMentors() {
        for (ExerciseQueueObserver exerciseQueueObserver : mentors) {
            exerciseQueueObserver.update(this);
        }
    }

    @Override
    public void removeMentor(ExerciseQueueObserver exerciseQueueObserver) {
        mentors.remove(exerciseQueueObserver);
    }

    public List<String> getExercises() {
        return exercises;
    }

    public String getStudentName() {
        return studentName;
    }
}
