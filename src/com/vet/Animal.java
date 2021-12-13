package com.vet;

public class Animal {

    public Animal(String nickname, String food, String location) {
        this.nickname = nickname;
        this.food = food;
        this.location = location;
    }

    private String nickname;

    private String food;
    private String location;
    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public String getNickname() {
        return nickname;
    }


    public void makeNoise () {
       System.out.println("Животное издает звуки");
   }

    public void eat () {
        System.out.println("Животное ест");
    }

    public void sleep () {
        System.out.println("Животное спит");
    }

    public static void main(String[] args) {

    }
}
