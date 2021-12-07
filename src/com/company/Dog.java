package com.company;

public class Dog extends Animal {

    private String breed;
    private int weight;
    private String feed;

    public void makeNoise () {
        System.out.println("Соба лает");
    }

    public void eat () {
        System.out.println("Собака ест корм");
    }

}
