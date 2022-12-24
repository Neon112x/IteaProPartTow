package HomeTaskNine;

import java.util.Scanner;

public class Book extends Title {


    public Book() {
    }

    public Book(String author, String content, String title) {
        super(author, content, title);
    }

    public static void main(String[] args) {
        Book book = new Book("Herbert S.", "Fundamentals of Java,", "Java: A Beginner’s Guide");
        book.show();

        Book bookOne = new Book();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter author: ");
        bookOne.setAuthor(scanner.nextLine());

        System.out.print("Enter content: ");
        bookOne.setContent(scanner.nextLine());

        System.out.print("Enter title: ");
        bookOne.setTitle(scanner.nextLine());

        bookOne.show();
    }

}
