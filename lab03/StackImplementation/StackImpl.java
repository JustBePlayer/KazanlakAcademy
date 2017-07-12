package sap.kazanlak.academy.datastructures.stack;

public class StackImpl<T> {
	private StackNode<T> top;
	private int size;
	
	public StackImpl(T value){
		StackNode<T> node = new StackNode<>(value);
		this.top = node;
		this.size = 1;
	}
	
	public void add(T val){
		StackNode<T> current = new StackNode<T>(val);
		current.setNext(top);
		top = current;
		size++;
	}
	
	public void pop(){
		StackNode<T> current = top.getNext();
		top = current;
		size--;
	}
	
	public int size(){
		return size;
	}
	
	public static void main(String[] args) {
		StackImpl<Integer> st = new StackImpl<Integer>(4);
		st.add(5);
		st.add(6);
		
		st.pop();
		st.pop();
		
		System.out.println(st.size());
	}
}
