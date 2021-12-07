package com.company;

public class Vetdoctor {

    public static void main(String[] args) {
        Animal[] vetAppointment = {Dog, Cat, Horse};
    }

    public void treatAnimal (Animal... patient) {
        for (Animal animal: patient){

            System.out.println("Записан на прием");
        }
    }
}