package org.example2;

import java.util.Iterator;
import java.util.Stack;

/*Este es el iterador #1, que recorre los nodos de arbol de una manera*/
public class PreOrderTreeIterator implements Iterator<Integer> {
    private Stack<Node> stack = new Stack<>();

    public PreOrderTreeIterator(Node root) {
        if (root != null) {
            stack.push(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public Integer next() {
        Node node = stack.pop();
        int result = node.getValue();

        if (node.getRight() != null) {
            stack.push(node.getRight());
        }

        if (node.getLeft() != null) {
            stack.push(node.getLeft());
        }

        return result;
    }
}
