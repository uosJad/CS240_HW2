
public class StackNode<T> implements StackInterface<T> {
	private Node lastNode;
	private int numOfItems;
	
	private static final int MAX_SIZE = 10;
	
	
	public StackNode(){
		lastNode = null;
		numOfItems = 0;
	}
	
	
	private class Node{
		private T data;
		private Node adr;
		
		public Node(T d, Node a){
			data = d;
			adr = a;
		}
		
		public void setData(T d){
			data = d;
		}
		
		public void setAdr(Node a){
			adr = a;
		}
	}

	@Override
	public void push(T newEntry) {
		if (numOfItems + 1 <= MAX_SIZE) {
			Node temp = new Node(newEntry, lastNode);
			lastNode = temp;
			numOfItems++;
		}
		
	}

	@Override
	public T pop() {
		T tempData = null;
		if (!isEmpty()){
			Node temp = lastNode;
			lastNode = temp.adr;
			temp.adr = null;
			tempData = temp.data;
		}
		return tempData;
	}

	@Override
	public T peek() {
		T tempData = null;
		if (!isEmpty()){
			tempData = lastNode.data;
		}
		return tempData;
	}

	@Override
	public boolean isEmpty() {
		boolean result = false;
		if (lastNode == null)
			result = true;
		return false;
	}

	@Override
	public void clear() {
		lastNode = null;
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
