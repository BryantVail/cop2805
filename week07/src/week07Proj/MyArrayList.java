package week07Proj;

import java.util.Collection;
import java.util.Iterator;

/**
    public:[add, ]
 */
public class MyArrayList<E> implements MyList<E>{

    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[]) new Object[INITIAL_CAPACITY];
    private int size = 0;

    public MyArrayList(){

    }

    public MyArrayList(E[] objects){

        for(int i = 0; i< objects.length; i++){
            add(objects[i]);//don't use 'super(objects)'
        }
    }

    //x
    @Override
    public void add(int index, E e){
        //ensure the right range for index
        if(index<0 || index > size){
            throw new IndexOutOfBoundsException(
                "Index: " + index + ", Size: "+ size
            );
        }
        
        ensureCapacity();

        //move the elements to the right- after the specified index
        for(int i = size - 1; i>= index; i--){
            data[i+1] = data[i];
        }

        //insert new element to data[index]
        data[index] = e;

        //increase size by 1
        size++;

    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException(
                "Index: " + index + ", Size: " + size
            );
        }
    }

    /**clear the list*/
    @Override
    public void clear(){
        data = (E[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override /**Return true if this list contains the element */
    public boolean contains(Object e){
        for(int i = 0; i< size; i++){
            if(e.equals(data[i])){
                return true;
            }
            
        }
        return false;        
    }

    private void ensureCapacity(){
        if(size >= data.length){
            E[] newData = (E[]) (new Object[size * 2+1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }

    @Override /**return the element at the specified index */
    public E get(int index){
        checkIndex(index);
        return data[index];
    }

    @Override /**Return the index of the first matching element in this list. Return -1 if no match.  */
    public int indexOf(Object e){
        for(int i = 0; i < size; i++){
            if(e.equals(data[i])){
                return i;
            }
            
        }
        return -1;
    }

    @Override /**Return the index of the last matching element in this list. Return -1 if no match.  */
    public int lastIndexOf(E e){
        for(int i = size -1; i >= 0; i--){
            if(e.equals(data[i])){
                return i;
            }
        }
        return -1;
    }

    @Override /**Remove the element at the specified position in this list. Shift ANY subsequent elements to the left. 
    Return the element that was removed from the list. */
    public E remove(int index){
        checkIndex(index);
        E e = data[index];
        //shift data to the left
        for(int j = index; j < size -1; j++){
            data[j] = data[j + 1];

        }
        data[size -1] = null;//this element is now 'null'

        //Decrement size
        size--;

        return e;
    }

    @Override /**Replace the element at the specified position in this list with the specified element. */
    public E set(int index, E e){
        checkIndex(index);
        E old = data[index];
        data[index] = e;
        return old;
    }

    public void trimToSize(){

    }

    @Override/**toString */
    public String toString(){
        StringBuilder result = new StringBuilder("[");
        
        for(int i = 0; i < size; i++){
            result.append(data[i]);
        }
        return result.toString();
    }

	@Override
	public boolean addAll(Collection<? extends E> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}




















