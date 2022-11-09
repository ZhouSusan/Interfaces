package org.example;

public class Main {
    public static void main(String[] args) {
        Duck donaldDuck = new Duck();
        System.out.format("Donald %s says %s", donaldDuck.name(), donaldDuck.sound());
    }
}