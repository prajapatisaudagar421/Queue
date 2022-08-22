package com.proirtyqueue;

import java.util.Arrays;

public class Proirty {
int[] arr = new int[5];
int count;
public String toString() {
	return Arrays.toString(arr);
}
public void enqueue(int data) {
	if(isFull()) {
		System.out.println("queue full");
		return;
	}
	int i;
	for ( i = count-1; i >= 0; i--) {
		if(data<arr[i]) {
			arr[i+1] = arr[i];
		}else {
			break;
		}
	}
	arr[i+1] = data;
	count++;
}
public int dequeue() {
	if(isEmpty()) {
		System.out.println("queue empty");
		return -1;
	}
	int result =  arr[--count];
	arr[count] = 0;
	return result;
}
//public int peek() {}
public boolean isEmpty() {
	return count == 0;
}
public boolean isFull() {
	return count == arr.length;
}

}
