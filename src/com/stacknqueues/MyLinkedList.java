package com.stacknqueues;

public class MyLinkedList {
	public INode head;
	public INode tail;

	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void addNode(INode newNode) {
		if (tail == null) {
			this.tail = newNode;
		}
		if (head == null) {
			this.head = newNode;
		} else {
			INode tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);

		}
	}

	public INode pop() {
		INode temp = this.head;
		this.head = head.getNext();
		return temp;
	}

	public void appendNode(INode newNode) {
		if (head == null) {
			this.head = newNode;
		}
		if (tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void printNodes() {
		System.out.print("My Nodes ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			System.out.print(tempNode.getKey());
			if (!tempNode.equals(tail)) {
				System.out.print("->");
			}
			tempNode = tempNode.getNext();
		}
		System.out.print(tempNode.getKey());
		System.out.println();
	}
}
