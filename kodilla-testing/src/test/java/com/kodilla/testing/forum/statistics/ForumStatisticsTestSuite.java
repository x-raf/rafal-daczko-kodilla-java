package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testCalculateAdvStatisticsCaseZeroPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics statForum = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> theList = new ArrayList<>();
        theList.add("Wojtek");
        theList.add("Janek");
        theList.add("Tomek");
        theList.add("Marcin");
        theList.add("Helena");
        when(statisticsMock.usersNames()).thenReturn(theList);
        //When
        statForum.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statForum.getQuantityOfPosts(),0.001);
        Assert.assertEquals(10, statForum.getQuantityOfComments(),0.001);
        Assert.assertEquals(5, statForum.getQuantityOfUsers(),0.001);
        Assert.assertEquals(0, statForum.getAvgPostsPerUser(),0.001);
        Assert.assertEquals(0, statForum.getAvgCommentsPerPost(),0.001);
        Assert.assertEquals(2, statForum.getAvgCommentsPerUser(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsCaseThousandPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics statForum = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        List<String> theList = new ArrayList<>();
        theList.add("Wojtek");
        theList.add("Janek");
        theList.add("Tomek");
        theList.add("Marcin");
        theList.add("Helena");
        when(statisticsMock.usersNames()).thenReturn(theList);
        //When
        statForum.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(1000, statForum.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(100, statForum.getQuantityOfComments(),0.001);
        Assert.assertEquals(5, statForum.getQuantityOfUsers(),0.001);
        Assert.assertEquals(200, statForum.getAvgPostsPerUser(),0.001);
        Assert.assertEquals(10, statForum.getAvgCommentsPerPost(), 0.001);
        Assert.assertEquals(2, statForum.getAvgCommentsPerUser(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsCaseZeroComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics statForum = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(100);
        List<String> theList = new ArrayList<>();
        theList.add("Wojtek");
        theList.add("Janek");
        theList.add("Tomek");
        theList.add("Marcin");
        theList.add("Helena");
        when(statisticsMock.usersNames()).thenReturn(theList);
        //When
        statForum.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statForum.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(0, statForum.getQuantityOfComments(),0.001);
        Assert.assertEquals(5, statForum.getQuantityOfUsers(),0.001);
        Assert.assertEquals(20, statForum.getAvgPostsPerUser(),0.001);
        Assert.assertEquals(0, statForum.getAvgCommentsPerPost(), 0.001);
        Assert.assertEquals(0, statForum.getAvgCommentsPerUser(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsCaseZeroUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics statForum = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(10);
        //When
        statForum.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(500, statForum.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(10, statForum.getQuantityOfComments(),0.001);
        Assert.assertEquals(0, statForum.getQuantityOfUsers(),0.001);
        Assert.assertEquals(0, statForum.getAvgPostsPerUser(),0.001);
        Assert.assertEquals(0.02, statForum.getAvgCommentsPerPost(), 0.001);
        Assert.assertEquals(0, statForum.getAvgCommentsPerUser(),0.001);
    }
    @Test
    public void testCalculateAdvStatisticsCaseHundredUsers() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ForumStatistics statForum = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(500);
        when(statisticsMock.commentsCount()).thenReturn(10);
        List<String> theList = new ArrayList<>();
        for (int i=1; i<= 100; i++){
            String forumUser = "User"+i;
            theList.add(forumUser);
        }
        when(statisticsMock.usersNames()).thenReturn(theList);
        //When
        statForum.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(500, statForum.getQuantityOfPosts(), 0.001);
        Assert.assertEquals(10, statForum.getQuantityOfComments(),0.001);
        Assert.assertEquals(100, statForum.getQuantityOfUsers(),0.001);
        Assert.assertEquals(5, statForum.getAvgPostsPerUser(),0.001);
        Assert.assertEquals(0.02, statForum.getAvgCommentsPerPost(), 0.001);
        Assert.assertEquals(0.1, statForum.getAvgCommentsPerUser(),0.001);
    }
}
