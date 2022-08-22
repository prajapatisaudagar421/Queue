package com.queueusingstack;

import java.util.Stack;

public class Queueusingstack {
	private Stack<Integer> stack1 = new Stack();
	private Stack<Integer> stack2 = new Stack();
	public void enqueue(int data) {
		stack1.push(data);
	}
	public int dequeue() {
		if(stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("both stack empty");
			return -1;
		}
		if(stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}
		return stack2.pop();
	}
	public int peek() {
		if(stack1.isEmpty() && stack2.isEmpty()) {
			System.out.println("both stack empty");
			return -1;
		}
		if(stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			return stack2.peek();
		}
		return stack2.peek();
	}
	@Override
	public String toString() {
		return "stack1=" + stack1 + ", stack2=" + stack2;
	}
}
