package org.example1;

import java.util.ArrayList;
import java.util.List;

/*Aqui es donde agregan los datos a iterar y se le dice que clase iteradora es la que se va a usar, en este ejemplo
* sencillo solo tengo una clase iteradora que es BookIterator*/
public class IterableBookCollection implements BookCollection {
    private final List<Book> books;

    public IterableBookCollection() {
        this.books = new ArrayList<>();
    }

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public MyIterator createIterator() {
        return new BookIterator(books);
    }
}
