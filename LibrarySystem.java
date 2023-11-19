package 자습.도서관리_시스템;


import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book> books = new ArrayList<>();

    public void addBook(String title, String author) {
        Book newBook = new Book(title, author);
        books.add(newBook);
        System.out.println("도서가 추가되었습니다: " + newBook);
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("도서가 없습니다.");
        } else {
            System.out.println("도서 목록:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

}