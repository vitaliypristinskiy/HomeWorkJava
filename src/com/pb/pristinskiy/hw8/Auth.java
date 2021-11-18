package com.pb.pristinskiy.hw8;

public class Auth {

    private String login;
    private String password;
    private String confirmPassword;

    public void signUp (String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        if (login.matches("[\\w]+") && login.length() < 21 && login.length() > 4) {
            this.login = login;
        } else {
            throw new WrongLoginException("Логин должен содержать только латинские буквы и цифры");
        }
        if (password.equals(confirmPassword) && (password.matches("[\\w]+") || password.contains("_") )
                && password.length() < 21 && password.length() > 4) {
            this.password = password;
            System.out.println("Регистрация успешна.");
        } else {
            throw new WrongPasswordException("Пароль должен содержать только латинские буквы, цифры и нижнее подчеркивание");
        }
    }

    public void signIn(String login, String password) throws WrongLoginException{
        if (login.equals(this.login) && password.equals(this.password)){
            System.out.println("Вход выполнен успешно.");
        }
        else {
            throw new WrongLoginException("Неверно введен логин или пароль.");
        }
    }

}
