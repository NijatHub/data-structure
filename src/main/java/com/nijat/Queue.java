package com.nijat;

public class Queue {
    private Node front;
    private Node rear;
    private int totalSum;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.totalSum = 0;
    }

    public void enqueue(int value) {
        Node newNode = new Node(value);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.nextNode = newNode;
            newNode.previousNode = rear;
            rear = newNode;
        }
        totalSum += value;
    }

    public int dequeue() {
        if(isEmpty()){
            return -1;
        }
        int dequeuedValue = front.value;
        front = front.nextNode;
        if (front == null) {
            rear = null;
        } else {
            front.previousNode = null;
        }
        totalSum -= dequeuedValue;
        return dequeuedValue;
    }

    public int front() {
        return isEmpty() ? -1 : front.value;
    }

    public int rear() {
        return isEmpty() ? -1 : rear.value;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int totalSum() {
        return totalSum;
    }
}
