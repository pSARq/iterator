package org.example2;

import java.util.Iterator;

/*Esta es una interfaz que se encarga de la construccion de los nodos del arbol y de crear los diferentes iteradores
* La logica de crear los iteradores y de crear el arbol podria separarse para cumplir de mejor manera el principio SOLID #1
* pero para mantener este ejemplo mas sencillo es mejor asi*/
public interface Tree {
    void insert(int value);
    Iterator<Integer> createIterator();
    Iterator<Integer> createPreOrderIterator();
}
