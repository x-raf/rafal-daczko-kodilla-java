package com.kodilla.patterns2.observer.homework;

public class Mentor implements ExerciseQueueObserver {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(StudentExerciseQueue studentExerciseQueue) {
        System.out.println(mentorName + ": New exercises in queue by " + studentExerciseQueue.getStudentName() + "\n"
        + "(total: " + studentExerciseQueue.getExercises().size() + " exercises)");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
