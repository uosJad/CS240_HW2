import java.util.Vector;


public class StackVector<T> implements StackInterface<T>{

	private Vector<T> v;
	
	private static final int MAX_SIZE = 10;
	
	public StackVector(){
		v = new Vector<T>(0,1);
	}
	
	@Override
	public void push(T newEntry) {
		if (v.capacity() < MAX_SIZE)
			v.add(newEntry);
	}

	@Override
	public T pop() {
		return v.remove(v.capacity()-1);
	}

	@Override
	public T peek() {
		return v.lastElement();
	}

	@Override
	public boolean isEmpty() {
		return v.isEmpty();
	}

	@Override
	public void clear() {
		v.clear();
	}

	@Override
	public T[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
