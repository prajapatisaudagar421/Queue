package com.Circularqueue;

import java.util.Arrays;

public class Circular {
	int[] arr;
	int front, rear, count;

	public Circular(int size) {
		arr = new int[size];
	}
	public String toString() {
		return Arrays.toString(arr);
	}
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("queue full");
			return;
		}
		arr[rear] = data;
		rear = (rear+1)%arr.length;
		count++;
	}
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("queue empty");
			return -1;
		}
		int result = arr[front];
		arr[front] = 0;
		front = (front+1)%arr.length;
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
