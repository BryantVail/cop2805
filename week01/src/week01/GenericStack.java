package week01;

/**
 * 
 * @author bvail
 *
 * @param <E>
 *            this is the generic type
 */
public class GenericStack<T> {

	private java.util.ArrayList<T> list = new java.util.ArrayList<>();

	/**
	 * Gets the size of the collection
	 * 
	 * @return Returns the size
	 */
	public int getSize() {
		return list.size();
	}

	/**
	 * looks at the next collection item
	 * 
	 * @return Returns the item
	 */
	public T peek() {
		return list.get(getSize() - 1);
	}

	/**
	 * Pushes object onto the stack
	 * 
	 * @param o
	 *            is a generic object
	 */
	public void push(T o) {
		list.add(o);
	}

	/**
	 * pops an item off the stack & returns it
	 * 
	 * @return the item popped off the stack
	 */
	public T pop() {
		T o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	/**
	 * checks the state of isEmpty()
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}

}
