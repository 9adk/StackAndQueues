package com.stacknqueues;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {

	/**
	 * Usecase3
	 */
	@Test
	public void given3Numbers_WhenAddedToQueue_ShouldBeAppendedAtRear() {
		MyQueue queue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		queue.printQueue();
	}

	/**
	 * Usecase4
	 */
	@Test
	public void givenQueue_WhenDequeued_ShouldRemovedValueFromFront() {
		MyQueue queue = new MyQueue();
		MyNode<Integer> myFirstNode = new MyNode(56);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(70);
		queue.enqueue(myFirstNode);
		queue.enqueue(mySecondNode);
		queue.enqueue(myThirdNode);
		queue.printQueue();
		queue.dequeue();
		queue.printQueue();
	}

}
