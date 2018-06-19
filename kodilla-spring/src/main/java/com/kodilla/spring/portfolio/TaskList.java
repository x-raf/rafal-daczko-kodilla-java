package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaskList {
    private final List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public void addTaskToList(String task) {
        tasks.add(task);
    }

    public String getTaskFromList(int index) {
        return tasks.get(index);
    }

    @Override
    public String toString() {
        return " " + tasks + " ";
    }
}
