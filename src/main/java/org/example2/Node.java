package org.example2;

/*Esta interfaz no es obligatoria pero sirve para cumplir el principio SOLID 5*/
public interface Node {
    int getValue();
    void setLeft(Node left);
    Node getLeft();
    void setRight(Node right);
    Node getRight();
}
