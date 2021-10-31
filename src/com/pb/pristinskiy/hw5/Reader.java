package com.pb.pristinskiy.hw5;

public class Reader {

        private String fullName;
        private String readerNumber;
        private String faculty;
        private String dateBirth;
        private String numberPhone;

        public String getFullName () {
            return fullName;
        }

        public void setFullName (String fullName){
            this.fullName = fullName;
        }

        public String getReaderNumber () {
            return readerNumber;
        }

        public void setReaderNumber (String readerNumber){
            this.readerNumber = readerNumber;
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
    public Reader(String fullName, String readerNumber, String faculty,
                  String dateBirth, String numberPhone) {
        this.fullName = fullName;
        this.readerNumber = readerNumber;
        this.faculty = faculty;
        this.dateBirth = dateBirth;
        this.numberPhone = numberPhone;
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
            System.out.println(book.getTitle() + ", автор - " + book.getAuthor());
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
            System.out.println(book.getTitle() + ", автор - " + book.getAuthor());
        }
        System.out.println();
    }

    public String getInfo() {
        return "{" +
                "ФИО='" + fullName + '\'' +
                ", Номер читательского=" + readerNumber +
                ", Факультет='" + faculty + '\'' +
                ", Дата рождения='" + dateBirth + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Book reader1 = new Book();
        Book reader2 = new Book();
        Book reader3 = new Book();

       // reader1.setTitle("Приключения");
        //System.out.println(reader1.getInfo());

    }
}
