package main.java.com.fezor.creational.builder.userExample;

import main.java.com.fezor.creational.builder.userExample.builders.UserBuilder;
import main.java.com.fezor.creational.builder.userExample.model.User;

public class Main {
    public static void main(String[] args) {
        User user = new UserBuilder()
                .setName("Example")
                .setAge(30)
                .setEmail("Example@email.com")
                .build();

        System.out.println("User created!!!");
        System.out.println("Name: " + user.getName() + "\n" +
                            "Age: " + user.getAge() + "\n" +
                            "Email: " + user.getEmail()
        );
    }
}
