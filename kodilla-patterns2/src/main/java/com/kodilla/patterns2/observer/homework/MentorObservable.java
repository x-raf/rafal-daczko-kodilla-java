package com.kodilla.patterns2.observer.homework;

public interface MentorObservable {
    void registerMentor(ExerciseQueueObserver exerciseQueueObserver);
    void notifyMentors();
    void removeMentor(ExerciseQueueObserver exerciseQueueObserver);
}
