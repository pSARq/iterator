package org.example2;


public class TreeNode implements Node {
    private final int value;
    private Node left;
    private Node right;

    public TreeNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    @Override
    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }
}
