package org.example1;

/*Esta interfaz con la que interactua la clase cliente para la creacion de la clase iteradora*/
public interface BookCollection {
    void addBook(Book book);
    MyIterator createIterator();
}
