package com.pb.pristinskiy.hw5;

public class Library {
    public static void main(String[] args) {
        Reader reader1 = new Reader("Петров В.В.", 1, "ИФ",
                "21.10.1999", "+806711111", "10012");
        Reader reader2 = new Reader("Никольский А.А.", 2, "ИФ",
                "11.11.1997", "+806722222", "10015");
        Reader reader3 = new Reader("Иващенко А.Г.", 3, "ИФ",
                "05.04.2005", "+806733333", "10012");
        Reader[] readers = {reader1, reader2, reader3};

        Book book1 = new Book("Приключения", "Иванов И.И.", 2005);
        Book book2 = new Book("Словарь", "Сидоров А. В", 1980);
        Book book3 = new Book("Энциклопедия", "Гусев К. В.", 2010);
        Book[] books = {book1, book2, book3};

        printReaders(readers);
        printBooks(books);

        reader1.takeBook(3);
        reader2.takeBook("Космобиолухи, Громыко", "Java программирование, Шилдт");
        reader3.takeBook(book1, book2,book3);

        reader1.returnBook("Приключения, Словарь, Энциклопедия");
        reader2.returnBook("Java программирование, Шилдт");
        reader3.returnBook(book3);
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
