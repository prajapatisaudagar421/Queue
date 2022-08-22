package com.reversequeueusingstack;

import java.util.ArrayDeque;
import java.util.Stack;

import com.Arrayqueue.Queue;

public class Main {
	public static void reverse(java.util.Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<>();
		while (!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}
	}
public static void main(String[] args) {
	java.util.Queue<Integer> queue = new ArrayDeque<Integer>();
	queue.add(10);
	queue.add(20);
	queue.add(30);
	System.out.println(queue);
	reverse(queue);
	System.out.println(queue);
}
}
