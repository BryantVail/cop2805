package week07;

public class MyArrayList<T> {
	
	//main data structure
	private Object internalArray;
	private int internalArraySize;
	
	
	MyArrayList(){
		internalArray = new Object[10];
	}
	
	public void add(T obj) {
		
	}
	
	public T get(int n) {
		//by index
		return (T)internalArray[n];
	}
	
	public void deleteItem(T obj) {
		int indexOfItemToBeDeleted = findIndex(internalArray, internalArray[n]);
		for(int i = indexOfItemToBeDeleted; i < internalArray.length-1 ; i++) {
			internalArray[i] = internalArray[i+1];
		}
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
		return internalArraySize;
	}

}
