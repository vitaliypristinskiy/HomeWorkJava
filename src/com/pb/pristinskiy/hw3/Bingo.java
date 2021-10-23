package com.pb.pristinskiy.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int attempt = 0;
        int Number= 0;

        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: Угадать число, Введите число от 1 до 100. Или число больше 100 для выхода.");

        int MyNumber = random.nextInt(101);

            do {
                attempt++;
                System.out.print("Введите ваше число: ");
                Number = input.nextInt();

                if (Number > 100) {
                    break;
                } else if (Number > MyNumber) {
                    System.out.println("Введенное число больше чем задуманное.");
                } else if (Number < MyNumber) {
                    System.out.println("Введенное число меньше чем задуманное.");
                } else if (Number == MyNumber) {
                    System.out.println("Поздравляем, Вы угадали с " + attempt + " попытки!");
                }
            } while (Number != MyNumber);
        System.out.println("Конец игры!");

    }

}
