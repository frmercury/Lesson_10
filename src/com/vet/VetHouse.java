package com.vet;

public class VetHouse {

    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурка","молоко", "flat", "короткий", "мяу", "голубые");
        Dog dog1 = new Dog("Брюс","корм Acana", "частный двор", "bulldog", 13);
        Horse horse1 = new Horse("GoodBoy", "овес", "стойло", "коричневый",100, "длинная");

        Animal[] vetAppointment = {cat1, dog1, horse1};

        treatAnimal(vetAppointment);
    }

    public static void treatAnimal (Animal... patient) {
        for (Animal animal: patient){
            System.out.println();
            System.out.println("Сегодня записаны на прием :");
            System.out.println("Кличка: " + animal.getNickname());
            System.out.println("Животное ест: " + animal.getFood());
            System.out.println("Животное обитает: " + animal.getLocation());
            System.out.printf("Причиная обращения: "); animal.makeNoise();
        }
    }
}