package com.capgi;

public interface INode<K> {
	K getKey();

	INode<K> getNext();

	void setKey(K key);

	void setNext(INode<K> next);

}
