package com.pb.pristinskiy.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> objInt = new NumBox<Integer>(5);
        try {
            objInt.add(18);
            objInt.add(29);
            objInt.add(44);
            objInt.add(11);
            objInt.add(98);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Число с индексом [4] = " + objInt.get(3));
        System.out.println("Текущее количество элементов массива = " + objInt.length());
        System.out.println("Cреднее арифметического среди элементов массива = " + objInt.average());
        System.out.println("Сумма всех элементов массива = " + objInt.sum());
        System.out.println("Максимальный элемент массива = " + objInt.max());
    }
}
