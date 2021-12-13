package com.vet;

public class Horse extends Animal {
    private String color;

    public Horse(String nickname, String food, String location, String color, int speed, String mane) {
        super(nickname, food, location);
        this.color = color;
        this.speed = speed;
        this.mane = mane;
    }

    private int speed;
    private String mane;

    public void makeNoise () {
        System.out.println("Конь ржет");
    }

    public void eat () {
        System.out.println("Конь ест овес");
    }
}
