package OverloadedConstructors;

public class User {
    String username;
    String email;
    int age;

    User(String username) {
        this.username = username;
    }

    User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = age;
    }

    User() {
        this.username = "Guest";
        this.email = "Email not provided";
        this.age = 0;
    }

    void play() {
        System.out.println(this.username + " is playing...");
    }
}
