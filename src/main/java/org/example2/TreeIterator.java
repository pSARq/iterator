package org.example2;

import java.util.Iterator;
import java.util.Stack;

/*Este es otro iterador que recorre los nodos del arbor de otra manera*/
public class TreeIterator implements Iterator<Integer> {
    private final Stack<Node> stack = new Stack<>();

    public TreeIterator(Node root) {
        while (root != null) {
            stack.push(root);
            root = root.getLeft();
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
            node = node.getRight();
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
        }
        return result;
    }
}
