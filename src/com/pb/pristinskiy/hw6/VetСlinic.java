package com.pb.pristinskiy.hw6;

public class VetСlinic {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Собачий корм", "Бутка");
        animals[1] = new Cat("Молоко и рыба", "Квартира многоэтажного дома");
        animals[2] = new Horse("Овес", "Конная ферма");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
