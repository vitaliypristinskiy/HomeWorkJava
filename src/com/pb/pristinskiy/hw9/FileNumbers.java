package com.pb.pristinskiy.hw9;
import java.io.FileWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) {
        String num = createNumbersFile();
        System.out.println("Создание файла " + num);
        String num2 = createOddNumbersFile(num);
        System.out.println("Создание файла " + num2);
    }
    static String createNumbersFile() {
        StringBuilder num2 = new StringBuilder();
        Random rand = new Random();
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                num2.append(rand.nextInt(100));
                if (i != 9) {
                    num2.append(" ");
                } else if (j != 9) {
                    num2.append(System.lineSeparator());
                }
            }
        }
        String fileName = "src/com/pb/pristinskiy/hw9/numbers.txt";
        try (Writer writer = new FileWriter(fileName)){
            writer.write(num2.toString());
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return fileName;
    }
    static String createOddNumbersFile(String fileName) {
        StringBuilder num2 = new StringBuilder();
        Path path = Paths.get(fileName);

        try (Scanner scan = new Scanner(path)) {
            while (scan.hasNextLine()) {
                String[] num =  scan.nextLine().split(" ");
                for (int j = 0; j < num.length; j++) {
                    int x = Integer.parseInt(num[j]);
                    if (x%2 != 0) {
                        num2.append(x);
                    } else {
                        num2.append(0);
                    }
                    if (j != 9) {
                        num2.append(" ");
                    } else {
                        num2.append(System.lineSeparator());
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        num2.delete(num2.length() - 2,num2.length());
        try (Writer writer = new FileWriter("src/com/pb/pristinskiy/hw9/odd-numbers.txt")){
            writer.write(num2.toString());
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return "src/com/pb/pristinskiy/hw9/odd-numbers.txt";
    }
}
