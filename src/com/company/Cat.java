package com.company;

public class Cat extends Animal {
    private String fur;
    private String sound;
    private String drink;

    public void makeNoise () {
        System.out.println("Кот мурчит");
    }

    public void eat () {
        System.out.println("Кот ест молоко");
    }
}
