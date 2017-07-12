package sap.kazanlak.academy.datastructures.stack;

public class StackNode<T> {
	private T value;
	private StackNode<T> next;
	
	public StackNode(T val){
		value = val;
	}
	
	public void setNext(StackNode<T> node){
		this.next = node;
	}
	
	public StackNode<T> getNext(){
		return next;
	}
	
	public T getValue(){
		return value;
	}
}
