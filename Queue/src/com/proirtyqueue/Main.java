package com.proirtyqueue;

public class Main {
public static void main(String[] args) {
	Proirty queue = new Proirty();
	queue.enqueue(8);
	queue.enqueue(10);
	queue.enqueue(1);
	queue.enqueue(2);
	System.out.println(queue);
	System.out.println(queue.dequeue());
	System.out.println(queue);
}
}
