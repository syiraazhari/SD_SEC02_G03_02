package com.example.loginapps;

public class UserProfile {

    //public String userAge;
    public String userEmail;
    public String userName;

    public UserProfile(String email, String name){

    }

    public UserProfile(String userAge, String userEmail, String userName) {
        //this.userAge = userAge;
        this.userEmail = userEmail;
        this.userName = userName;
    }

//    public String getUserAge() {
//        return userAge;
//    }
//
//    public void setUserAge(String userAge) {
//        this.userAge = userAge;
//    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}