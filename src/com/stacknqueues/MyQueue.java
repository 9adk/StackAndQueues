package com.stacknqueues;

public class MyQueue {
	private final MyLinkedList list;

	public MyQueue() {
		list = new MyLinkedList();
	}

	public void enqueue(INode node) {
		list.appendNode(node);
	}

	public void printQueue() {
		list.printNodes();
	}
}
