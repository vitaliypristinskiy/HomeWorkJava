package com.pb.pristinskiy.hw6;
import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Собачий корм", "Бутка");
        animals[1] = new Cat("Молоко и рыба", "Квартира многоэтажного дома");
        animals[2] = new Horse("Овес", "Конная ферма");



        Class<?> vetClazz = Class.forName("com.pb.pristinskiy.hw6.Veterinarian");
        Constructor constr = vetClazz.getConstructor();
        Object obj = constr.newInstance();
        if (obj instanceof Veterinarian) {
            for (Animal animal : animals) {
            ((Veterinarian) obj).treatAnimal(animal);
            }
       }
    }
}
