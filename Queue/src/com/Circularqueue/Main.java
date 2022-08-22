package com.Circularqueue;

public class Main {
public static void main(String[] args) {
	Circular queue = new Circular(5);
	queue.enqueue(10);
	queue.enqueue(20);
	queue.enqueue(30);
	queue.enqueue(40);
	System.out.println(queue.dequeue());
	System.out.println(queue);
	System.out.println(queue.isEmpty());
	System.out.println(queue.isFull());
	queue.enqueue(50);
	queue.enqueue(60);
	System.out.println(queue);
}
}
