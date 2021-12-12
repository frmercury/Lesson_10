package com.vet;

public class Cat extends Animal {


    public Cat(String nickname, String food, String location, String fur, String sound, String eyeColor) {
        super(nickname, food, location);
        this.fur = fur;
        this.sound = sound;
        this.eyeColor = eyeColor;
    }

    private String fur;
    private String sound;
    private String eyeColor;




    public void makeNoise () {
        System.out.println("Кот мурчит");
    }

    public void eat () {
        System.out.println("Кот ест молоко");
    }
}
