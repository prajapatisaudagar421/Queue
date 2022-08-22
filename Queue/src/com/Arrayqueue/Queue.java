package com.Arrayqueue;

import java.util.Arrays;

public class Queue {
	int[] arr;
	int front, rear, count;

	public Queue(int size) {
		arr = new int[size];
	}
	@Override
	public String toString() {
		return Arrays.toString(arr);
	}
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("queue full");
			return;
		}
		arr[rear] = data;
		rear++;
		count++;
			
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue empty");
			return -1;
		}
		int result = arr[front];
		arr[front] = 0;
		front++;
		count--;
		return result;
	}
	public int peek() {
		return arr[front];
	}
	public boolean isEmpty() {
		return count == 0;
	}
	public boolean isFull() {
		return count == arr.length;
	}
}
