package com.pb.pristinskiy.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста, введите целое число");
        int number = scan.nextInt();

        if (number >= 0 && number <= 14) {
            System.out.print("[0-14]");
        } else if (number >= 15 && number <= 35) {
            System.out.print("[15-35]");
        } else if (number >= 36 && number <= 50) {
            System.out.print("[36-50]");
        } else if (number >= 51 && number <= 100) {
            System.out.print("[51-100]");
        } else {
            System.out.print("введенное число не попадает ни в один из имеющихся промежутков");
        }


    }

}
