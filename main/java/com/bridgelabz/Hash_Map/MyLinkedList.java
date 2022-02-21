package com.bridgelabz.Hash_Map;

public class MyLinkedList<K> {
	public INode<K> head;
	public INode<K> tail;
	public MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void apend(INode<K> newNode) {
		if(this.head == null)
			this.head = newNode;
		if(this.tail == null)
			this.tail = newNode;
		else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}
	
	public INode<K> search(K node) {
		INode<K> tempNode = head;
		while( tempNode != null && tempNode.getNext() != null ) {
			if(tempNode.getKey().equals(node)) {
				return tempNode;
			}
			tempNode = tempNode.getNext();
		}
		return null;
	}
	
	public INode<K> pop() {
		INode<K> tempNode = this.head;
		this.head = head.getNext();
		return  tempNode;
	}
	public void searchAndDelete(INode<K> deleteNode) {
		MyLinkedList<K> n = new MyLinkedList<K>();
		INode<K> tempNode = head;
		while(tempNode.getNext() != null) {
			if(tempNode.getKey() == deleteNode.getKey()) {
				n.pop();
			}
			tempNode = tempNode.getNext();
		}
	}
	public void printMyNodes() {
		System.out.println("My Nodes : " + head);
	}
	
	@Override
	public String toString() {
		return "MyLinkedListNode{" + head + "}";
	}
}
