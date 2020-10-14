package com.capgi;

public class LinkedList<K> {
	private INode<K> head;
	private INode<K> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode<K> getHead() {
		return head;
	}

	public void setHead(INode<K> head) {
		this.head = head;
	}

	public INode<K> getTail() {
		return tail;
	}

	public void setTail(INode<K> tail) {
		this.tail = tail;
	}

	public void add(INode<K> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			INode<K> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);

		}

	}

	public void append(INode<K> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

	public void insertInBetweenTwoNumbers(INode<K> preNode, INode<K> postNode, INode<K> newNode) {
		preNode.setNext(newNode);
		newNode.setNext(postNode);
	}

	public INode<K> pop() {
		INode<K> tempNode = this.head;
		this.head = this.head.getNext();
		return tempNode;
	}

	public INode<K> popLast() {
		INode<K> tempNode = this.tail;
		INode<K> tempNodeHead = this.head;
		while (tempNodeHead.getNext().getNext() != null) {
			tempNodeHead = tempNodeHead.getNext();
		}
		this.tail = tempNodeHead;
		tempNodeHead.setNext(null);
		return tempNode;
	}

	public INode<K> searchNode(K value) {
		INode<K> tempNode = getHead();
		while (tempNode != null) {
			if (tempNode.getKey().equals(value)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return tempNode;
	}

	public void InsertAfterANode(K value, INode<K> newNode) {
		INode<K> tempNode = searchNode(value);
		newNode.setNext(tempNode.getNext());
		tempNode.setNext(newNode);
	}

	public void delete(K value) {
		INode<K> NodeBeforetempNode = getHead();
		INode<K> tempNode = searchNode(value);
		if (tempNode == null) {
			System.out.println("Node not present");
		} else {
			while (NodeBeforetempNode.getNext() != tempNode) {
				NodeBeforetempNode = NodeBeforetempNode.getNext();
			}
			NodeBeforetempNode.setNext(tempNode.getNext());
		}
	}

	public int sizeOfList() {
		INode<K> tempNode = getHead();
		int size = 0;
		while (tempNode != null) {
			tempNode = tempNode.getNext();
			size++;
		}
		return size;
	}

	public void printLinkedList() {
		INode<K> tempNode = this.head;
		while (tempNode != null) {
			System.out.println(tempNode.getKey());
			tempNode = tempNode.getNext();
		}
	}

	@Override
	public String toString() {
		return "linkedListNode { " + head + " }";
	}
}
