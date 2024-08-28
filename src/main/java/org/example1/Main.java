package org.example1;

public class Main {
    public static void main(String[] args) {
        /*En este ejemplo se crea una interfaz personalizada llamada MyIterator para poder entender el patron, pero
        * en el siguiente ejemplo ya se usa es la propia de Java*/
        BookCollection collection = new IterableBookCollection();
        collection.addBook(new Book("Book 1"));
        collection.addBook(new Book("Book 2"));
        collection.addBook(new Book("Book 3"));

        MyIterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}