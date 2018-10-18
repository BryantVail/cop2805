package week07;

public class Practice2 {

}

class MyLinkedList{
	
	private Box first;
	private Box last;
	
	public MyLinkedList() {
		first = null;
		last = null;
	}
	
	public void add(T obj) {
		Box newBox = new Box(obj, null);
		if(last != null) {
			last.next = newBox;
		
		}
		last = newBox;
	}
	
	public T get(int n) {
		//by index
		return (T)internalArray[n];
	}
	
	public void deleteItem(T obj) {
		
	}
	
	public void delete(int n) {
		
	}
	
	public int findIndex(Object[] objs, T objToFind) {
		int returned = -1;
		for(int i = 0; i<objs.length; i++) {
			if((Integer)objToFind == (Integer)objs[i]) {
				returned = i;
				
			}
			else {
				returned = -1;
			}
		}
		return returned;
		
	}
	
	public int size() {
	}
	
}

class Box{
	
	public Object obj;
	public Box next;
	public Box(Object obj) {
		this.obj = obj;
		this.next = next;
	}
	
}








