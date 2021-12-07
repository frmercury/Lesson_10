package com.company;

public class Horse extends Animal {
    private String color;
    private int speed;
    private String mane;

    public void makeNoise () {
        System.out.println("Конь ржет");
    }

    public void eat () {
        System.out.println("Конь ест овес");
    }
}
