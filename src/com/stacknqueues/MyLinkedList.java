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
		if (size() == 1) {
			INode currentNode = this.head;
			this.head = null;
			return currentNode;
		}
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

	public int size() {
		if (isEmpty()) {
			return 0;
		}
		INode temp = head;
		int count = 0;
		while (!temp.equals(tail)) {
			count++;
			temp = temp.getNext();
		}
		return count + 1;
	}

	public boolean isEmpty() {
		if (head == null) {
			return true;
		} else {
			return false;
		}
	}

	public void printNodes() {
		if (isEmpty()) {
			System.out.println("The list is empty");
			return;
		}
		System.out.print("My Nodes ");
		INode tempNode = head;
		while (tempNode.getNext() != null) {
			System.out.print(tempNode.getKey() + "->");
			tempNode = tempNode.getNext();
		}
		System.out.print(tempNode.getKey());
		System.out.println();
	}
}
