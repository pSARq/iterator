package org.example2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Tree tree = new BinaryTree();
        tree.insert(30);
        tree.insert(10);
        tree.insert(14);
        tree.insert(40);
        tree.insert(60);
        tree.insert(20);
        tree.insert(70);
        tree.insert(50);

        System.out.println("Recorrido en orden:");
        Iterator<Integer> inOrderIterator = tree.createIterator();
        while (inOrderIterator.hasNext()) {
            System.out.print(inOrderIterator.next() + " ");
        }

        System.out.println("\nRecorrido en preorden:");
        Iterator<Integer> preOrderIterator = tree.createPreOrderIterator();
        while (preOrderIterator.hasNext()) {
            System.out.print(preOrderIterator.next() + " ");
        }
    }
}
