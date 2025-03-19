package com.nijat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.front()); // 10
        System.out.println("Rear: " + queue.rear()); // 30
        System.out.println("Is Empty: " + queue.isEmpty()); // false
        System.out.println("Total Sum: " + queue.totalSum()); // 60
        System.out.println("Dequeued: " + queue.dequeue()); // 10
        System.out.println("Front: " + queue.front()); // 20
        System.out.println("Is Empty " + queue.isEmpty()); // false
    }
}