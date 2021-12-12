package com.vet;

public class Dog extends Animal {

    public Dog(String nickname, String food, String location, String breed, int weight) {
        super(nickname, food, location);
        this.breed = breed;
        this.weight = weight;
    }

    private String breed;
    private int weight;
    private String feed;

    public void makeNoise () {
        System.out.println("Собака лает");
    }

    public void eat () {
        System.out.println("Собака ест корм");
    }

}
