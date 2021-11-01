package com.pb.pristinskiy.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.","ИФ",
                "21.10.1999", "+806711111", "10012");
        Reader reader2 = new Reader("Никольский А.А.", "ПГС",
                "11.11.1997", "+806722222", "10015");
        Reader reader3 = new Reader("Иващенко А.Г.", "ИТ",
                "05.04.2005", "+806733333", "10025");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Приключения", "Иванов И.И.", 2005);
        Book book2 = new Book("Словарь", "Сидоров А. В", 1980);
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", 2010);
        Book book4 = new Book("Темная Башня. Стрелок","Стивен Кинг",1982);
        Book book5 = new Book("Самоучитель английского языка","Петрова А.В.",2001);
        Book[] books = {book1, book2, book3, book4, book5};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader1.takeBook("Приключения, Словарь, Энциклопедия");
        reader1.takeBook(book1, book2, book3);
        reader2.takeBook(book5);
        reader3.takeBook(book4);

        reader1.returnBook(3);
        reader1.returnBook("Приключения, Словарь, Энциклопедия");
        reader1.returnBook(book1, book2, book3);
        reader2.returnBook(book4);
        reader3.returnBook(book5);
    }

    private static void printBooks(Book[] books) {
        System.out.println("Список книг:");
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
        System.out.println();
    }

    private static void printReaders(Reader[] readers) {
        System.out.println("Список читателей:");
        for (Reader reader : readers) {
            System.out.println( reader.getInfo());
        }
        System.out.println();
    }
}
