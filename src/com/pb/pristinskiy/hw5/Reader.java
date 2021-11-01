package com.pb.pristinskiy.hw5;

public class Reader {

        private String fullName;
        private int number;
        private String readNumber;
        private String faculty;
        private String dateBirth;
        private String numberPhone;

        public String getFullName () {
            return fullName;
        }

        public void setFullName (String fullName){
            this.fullName = fullName;
        }

        public int getNumber () {
            return number;
        }

        public void setNumber (int number){
            this.number = number;
        }

        public String getReadNumber () {
            return readNumber;
        }

        public void setReadNumber (String readNumber){
        this.readNumber = readNumber;
    }

        public String getFaculty () {
            return faculty;
        }

        public void setFaculty (String faculty){
            this.faculty = faculty;
        }

        public String getDateBirth () {
            return dateBirth;
        }

        public void setDateBirth (String dateBirth){
            this.dateBirth = dateBirth;
        }

        public String getNumberPhone () {
            return numberPhone;
        }

        public void setNumberPhone (String numberPhone){
            this.numberPhone = numberPhone;
        }
    public Reader(String fullName, String faculty,
                  String dateBirth, String numberPhone, String  readNumber) {
        this.fullName = fullName;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.numberPhone = numberPhone;
        this.readNumber = readNumber;
    }
    public void takeBook(int number) {
        System.out.println(this.fullName + " взял " + number + " книги.");
    }

    public void takeBook(String... books) {
        System.out.println(this.fullName + " взял следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.println(this.fullName + " взял следующие книги:");
        for (Book book : books) {
            System.out.println(book.getTitle() + ", автор - " + book.getAuthor() +
                    ", год издания -" + book.getYear());
        }
        System.out.println();
    }

    public void returnBook(int number) {
        System.out.println(this.fullName + " вернул " + number + " книги.");
    }

    public void returnBook(String... books) {
        System.out.println(this.fullName + " вернул следующие книги:");
        for (String book : books) {
            System.out.println(book);
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.println(this.fullName + " вернул следующие книги:");
        for (Book book : books) {
            System.out.println(book.getTitle() + ", автор - " + book.getAuthor() +
                    ", год издания -" + book.getYear());
        }
        System.out.println();
    }

    public String getInfo() {
        return "{" +
                "ФИО='" + fullName + '\'' +
                ", Факультет='" + faculty + '\'' +
                ", Дата рождения='" + dateBirth + '\'' +
                ", Номер телефона='" + numberPhone + '\'' +
                ", Номер читательского='" + readNumber + '\'' +
                '}';
    }

}
