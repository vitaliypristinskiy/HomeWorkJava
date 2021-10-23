package com.pb.pristinskiy.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner scan = new Scanner(System.in);
        array[0] = scan.nextInt();;
        array[1] = scan.nextInt();;
        array[2] = scan.nextInt();;
        array[3] = scan.nextInt();;
        array[4] = scan.nextInt();;
        array[5] = scan.nextInt();;
        array[6] = scan.nextInt();;
        array[7] = scan.nextInt();;
        array[8] = scan.nextInt();;
        array[9] = scan.nextInt();;

        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

        int counter = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > 0)
                counter += 1;
        }
        System.out.println(counter);

        int [] mas = array;
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
