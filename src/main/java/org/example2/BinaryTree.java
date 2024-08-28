package org.example2;

import java.util.Iterator;


public class BinaryTree implements Tree {
    private Node root;

    @Override
    public void insert(int value) {
        root = insertRec(root, value);
    }

    @Override
    public Iterator<Integer> createIterator() {
        return new TreeIterator(root);
    }

    @Override
    public Iterator<Integer> createPreOrderIterator() {
        return new PreOrderTreeIterator(root);
    }

    /*Logica para insertar los nodos en el arbol*/
    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }

        if (value < root.getValue()) {
            root.setLeft(insertRec(root.getLeft(), value));
        } else if (value > root.getValue()) {
            root.setRight(insertRec(root.getRight(), value));
        }

        return root;
    }
}
