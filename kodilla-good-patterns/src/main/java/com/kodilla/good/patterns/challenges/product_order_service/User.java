package com.kodilla.good.patterns.challenges.product_order_service;

public class User {
    private String nickName;
    private String firstName;
    private String lastName;
    private String email;

    public User(final String nickName, final String firstName, final String lastName, final String email) {
        this.nickName = nickName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
    public String getFullUserName() {
        return firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "nickName='" + nickName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
