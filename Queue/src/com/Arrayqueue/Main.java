package com.Arrayqueue;

public class Main {
public static void main(String[] args) {
	Queue queue = new Queue(5);
	System.out.println(queue);
	System.out.println(queue.isEmpty());
	System.out.println(queue.isFull());
	queue.enqueue(10);
	queue.enqueue(20);
	queue.enqueue(30);
	queue.enqueue(40);
	System.out.println(queue);
	System.out.println(queue.dequeue());
	System.out.println(queue);
}
}
