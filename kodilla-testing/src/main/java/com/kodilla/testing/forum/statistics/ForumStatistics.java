package com.kodilla.testing.forum.statistics;

public class ForumStatistics{

    private int quantityOfUsers;
    private int quantityOfPosts;
    private int quantityOfComments;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics){
        quantityOfUsers = statistics.usersNames().size();
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();

        if (quantityOfUsers > 0) {
            avgCommentsPerUser = quantityOfComments/ (double) quantityOfUsers;
            avgPostsPerUser = quantityOfPosts/ (double) quantityOfUsers;
        }else {
            avgCommentsPerUser = 0;
            avgPostsPerUser = 0;
        }
        if (quantityOfPosts > 0) {
            avgCommentsPerPost = quantityOfComments/ (double) quantityOfPosts;
        }else {
            avgCommentsPerPost = 0;
        }
    }
}
