package org.example1;

/*Esta interfaz en Java existe por defecto y se llama Iterator, pero para el ejemplo del patron es mejor crear una desde 0*/
public interface MyIterator {
    boolean hasNext();
    Object next();
}
