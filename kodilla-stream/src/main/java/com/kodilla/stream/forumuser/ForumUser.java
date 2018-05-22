package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final String forumId;
    private final String forumUser;
    private final char userSex;
    private final LocalDate userDateOfBirth;
    private final int publishedPostsCount;

    public ForumUser(String forumId, String forumUser, char userSex, LocalDate userDateOfBirth, int publishedPostsCount) {
        this.forumId = forumId;
        this.forumUser = forumUser;
        this.userSex = userSex;
        this.userDateOfBirth = userDateOfBirth;
        this.publishedPostsCount = publishedPostsCount;
    }

    public String getForumId() {
        return forumId;
    }

    public String getForumUser() {
        return forumUser;
    }

    public char getUserSex() {
        return userSex;
    }

    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public int getPublishedPostsCount() {
        return publishedPostsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "forumId=" + forumId +
                ", forumUser='" + forumUser + '\'' +
                ", userSex=" + userSex +
                ", userDateOfBirth=" + userDateOfBirth +
                ", publishedPostsCount=" + publishedPostsCount +
                '}';
    }
}
