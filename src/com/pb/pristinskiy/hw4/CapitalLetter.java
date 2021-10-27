package com.pb.pristinskiy.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        function();
    }
        static void function() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Пожайлуста введите текст: ");

        String source = scan.nextLine();
        StringBuilder res = new StringBuilder();

         String[] strArr = source.split(" ");
        for (String str : strArr) {
           char[] stringArray = str.trim().toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
           str = new String(stringArray);

           res.append(str).append(" ");
         }

        System.out.print("Результат: " + res.toString().trim());

   }
}
