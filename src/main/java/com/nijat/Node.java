package com.nijat;

public class Node {
    int value;
    Node previousNode;
    Node nextNode;

    public Node(int value) {
        this.value = value;
        this.previousNode = null;
        this.nextNode = null;
    }
}
