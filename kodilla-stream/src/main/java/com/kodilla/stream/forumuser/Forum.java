package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private final List<ForumUser> theForumUsers = new ArrayList<>();

    public Forum(){
        theForumUsers.add(new ForumUser("001","Tom",'M',LocalDate.of(1999,8,25),18));
        theForumUsers.add(new ForumUser("002","Helena",'F',LocalDate.of(1999,5,15),205));
        theForumUsers.add(new ForumUser("003","Jerry",'M',LocalDate.of(2000,12,6),178));
        theForumUsers.add(new ForumUser("004","Jane",'F',LocalDate.of(2002,4,5),12));
        theForumUsers.add(new ForumUser("005","Henry",'M',LocalDate.of(1975,6,1),148));
        theForumUsers.add(new ForumUser("006","Rita",'F',LocalDate.of(2003,2,14),123));
        theForumUsers.add(new ForumUser("007","John",'M',LocalDate.of(2001,10,18),0));
    }
    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUsers);
    }
}
