package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Smith");
        User andy = new YGeneration("Andy Cricket");
        User joe = new ZGeneration("Joe Doe");

        //When
        String johnPublish = john.sharePost();
        System.out.println("John " + johnPublish);
        String andyPublish = andy.sharePost();
        System.out.println("Andy " + andyPublish);
        String joePublish = joe.sharePost();
        System.out.println("Joe " + joePublish);

        //Then
        Assert.assertEquals("[Share on Twitter]", joePublish);
        Assert.assertEquals("[Share on Facebook]", andyPublish);
        Assert.assertEquals("[Share on Snapchat]", johnPublish);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User john = new Millenials("John Smith");

        //When
        String johnPublish = john.sharePost();
        System.out.println("\nJohn " + johnPublish);
        john.setSocialPublisher(new FacebookPublisher());
        johnPublish = john.sharePost();
        System.out.println("John " + johnPublish);

        //Then
        Assert.assertEquals("[Share on Facebook]", johnPublish);
    }
}
