package com.pb.pristinskiy.hw2;
import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста, введите целое число");
        int number = scan.nextInt();

        switch(number) {
            case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9:
            case 10: case 11: case 12: case 13: case 14:

                System.out.println("[0 -14]");
                break;
            case 15: case 16: case 17: case 18: case 19: case 20: case 21: case 22: case 23: case 24:
            case 25: case 26: case 27: case 28: case 29: case 30: case 31: case 32: case 33: case 34:
            case 35:
                System.out.println("[15 -36]");
                break;
            case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45:
            case 46: case 47: case 48: case 49: case 50:


            case 51: case 52: case 53: case 54: case 55: case 56: case 57: case 58: case 59:
            case 60: case 61: case 62: case 63: case 64:
            default:
                System.out.println("Неверная оценка");
        }


    }

}
