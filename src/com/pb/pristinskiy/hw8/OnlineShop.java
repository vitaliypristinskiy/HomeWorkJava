package com.pb.pristinskiy.hw8;
import java.util.Scanner;

public class OnlineShop {
    static String enterString (){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        return str;
    }
    public static void main(String[] args) {

        Auth user = new Auth();
        System.out.println ("Для регистрации на сайте придумайте логин и пароль");
        System.out.println ("Придумайте логин (должен быть от 5 до 20 символов и содержать только латинские буквы и цифры):");
        String login = enterString();
        System.out.println ("Придумайте пароль (должен быть от 5 до 20 символов и содержать только латинские буквы и цифры и символ _):");
        String password = enterString();
        System.out.println ("Подтвердите пароль:");
        String confirmPassword = enterString();
        try {
            user.signUp(login, password, confirmPassword);
            System.out.println ("Для входа а сайт введите логин и пароль");
            System.out.println ("Введите логин:");
            login = enterString();
            System.out.println ("Введите пароль:");
            password = enterString();

            try {
                user.signIn(login, password);
            }
            catch (WrongLoginException c){
                System.out.println("Неверно введен логин или пароль.");
            }
        }
        catch (WrongLoginException a) {
            System.out.println("Ошибка регистрации");
            System.out.println("Логин не не соответствует требованиям");
        }
        catch (WrongPasswordException b){
            System.out.println("Ошибка регистрации");
            System.out.println("Пароли не свопадают или не соответствуют требованиям");
        }


    }


}
