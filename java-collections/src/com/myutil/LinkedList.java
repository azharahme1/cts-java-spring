package com.myutil;

public class LinkedList<E> {

	private int count = 0;

	private Node head = null;

	public void add(E data) {
		Node newNode = new Node(data);
		if (head == null) {
			this.head = newNode;
		} else {
			Node last = head;
			while (last.getNext() != null) {
				last = last.getNext();
			}
			last.setNext(newNode);
		}
		count++;
	}

	// ......

	public int size() {
		return this.count;
	}

	private class Node {

		private E data;
		private Node next;

		public Node(E data) {
			this.data = data;
		}

		public Node(E data, Node next) {
			super();
			this.data = data;
			this.next = next;
		}

		public Object getData() {
			return data;
		}

		public void setData(E data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

	}

}
