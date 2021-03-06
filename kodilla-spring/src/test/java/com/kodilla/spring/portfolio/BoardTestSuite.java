package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BoardTestSuite {
    @Autowired
    private Board board;
    @Test
    public void testTaskAdd() {
        //Given
        //ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        //Board board = context.getBean(Board.class);

        TaskList listToDo = board.getToDoList();
        listToDo.addTaskToList("Visit Henry in hospital.");
        System.out.println(listToDo);

        TaskList listInProgress = board.getInProgressList();
        listInProgress.addTaskToList("Buy him flowers.");
        System.out.println(listInProgress);

        TaskList listDone = board.getDoneList();
        listDone.addTaskToList("Call the doctor.");
        System.out.println(listDone);
        //When
        String taskToDo = listToDo.getTaskFromList(0);
        String taskInProgress = listInProgress.getTaskFromList(0);
        String taskDone = listDone.getTaskFromList(0);
        //Then
        Assert.assertEquals("Visit Henry in hospital.", taskToDo);
        Assert.assertEquals("Buy him flowers.", taskInProgress);
        Assert.assertEquals("Call the doctor.", taskDone);
    }
}
