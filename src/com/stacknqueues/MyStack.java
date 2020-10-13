package com.stacknqueues;

public class MyStack {
	private final MyLinkedList list;

	public MyStack() {
		list = new MyLinkedList();
	}

	public void push(INode node) {
		list.addNode(node);
	}

	public void printStack() {
		list.printNodes();
	}

	public INode peak() {
		return list.head;
	}

	public INode pop() {
		if (list.isEmpty()) {
			System.out.println("The stack is Empty");
		}
		return list.pop();
	}
}
