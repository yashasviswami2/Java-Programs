package com.company;

class Library {
    String[] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+ " has been added!");
    }
    void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String book: this.books){
            System.out.println("*" + book);
        }
    }
}
public class cwh_51_online_library
{
    public static void main(String[] args) {

        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow rich");
        centralLibrary.showAvailableBooks();
    }
}
