package org.example1;

import java.util.ArrayList;
import java.util.List;

/*Esta es la clase que contiene la logica del como se debe de iterar, en que orden o de que manera validar y retornar
* los elementos*/
public class BookIterator implements MyIterator {
    private final List<Book> books;
    private int index = 0;

    public BookIterator(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    /*Aquí una cosa a mejorar es que si se llama el método next y ya no tiene elementos, estalla por intentar acceder
    * a un índice de la lista que no existe, se podría agregar un control aquí directamente o sino desde donde se usa, pero pues
    * lo lógico es que desde donde se usa siempre se llama primero al método hasNext para evitar que eso pase*/
    @Override
    public Book next() {
        return books.get(index++);
    }
}
