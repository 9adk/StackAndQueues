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
