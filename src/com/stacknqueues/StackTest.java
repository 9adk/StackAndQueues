package com.stacknqueues;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StackTest {

	/**
	 * Usecase1
	 */
	@Test
	public void givenInputShouldAddToStack() {
		MyStack stack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode<Integer> peak = stack.peak();
		stack.printStack();
		assertEquals(peak, myThirdNode);
	}

	/**
	 * Usecase2
	 */
	@Test
	public void givenMethodShouldMatchPoppedValueWithLastAddedNode() {
		MyStack stack = new MyStack();
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		stack.push(myFirstNode);
		stack.push(mySecondNode);
		stack.push(myThirdNode);
		INode<Integer> pop = stack.pop();
		stack.printStack();
		assertEquals(pop, myThirdNode);

	}

}
