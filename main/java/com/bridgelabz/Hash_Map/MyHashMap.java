package com.bridgelabz.Hash_Map;

public class MyHashMap<K,V> {
MyLinkedList<K> myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList = new MyLinkedList<K>();
	}
	public V getValue(K key) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.search(key);
		return(myMapNode == null)? null : myMapNode.getVlaue();
	}
	public void add(K key,V value) {
		MyMapNode<K, V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<K,V>(key, value); 
			this.myLinkedList.apend((INode<K>) myMapNode);
		}
		else {
			myMapNode.setValue(value);
		}
	}
	 public void remove(K key){
	        MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) this.myLinkedList.search(key);
	        if(myMapNode != null) {
	            this.myLinkedList.searchAndDelete(myMapNode);
	        }
	    }
	@Override
	public String toString() {
		return "MyHashMapNodes {"+ myLinkedList +"}";
	}
}
