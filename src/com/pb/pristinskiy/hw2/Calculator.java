package com.pb.pristinskiy.hw2;
import java.util.Scanner;
import java.lang.String;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number one");
        int number1 = scan.nextInt();

        System.out.println("Input arithmetic operator");
        String sing = scan.next();

        System.out.println("Input number two");
        int number2 = scan.nextInt();



        switch (sing.charAt(0)) {
            case '+':
                System.out.println("number1 + number2 = " + (number1 + number2));
                break;
            case '-':
                System.out.println("number1 - number2 = " + (number1 - number2));
                break;
            case '*':
                System.out.println("number1 * number2 = " + (number1 * number2));
                break;
            case '/':
                if (number2 != 0) {
                    System.out.println("number1 / number2 = " + (number1 / number2));
                } else { System.out.print("error, you cannot divide by zero");}
                break;
        }



    }
}
