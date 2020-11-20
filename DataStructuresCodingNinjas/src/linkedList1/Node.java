package linkedList1;

public class Node<T> {
	
	T data;
	Node<T> next;
	
	Node(T data){
		this.data = data;
//		next = null; not needed, null is default reference!
	}

}
