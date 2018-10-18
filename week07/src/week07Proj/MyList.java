package week07Proj;

import java.util.Collection;

/**
@author	Bryant Vail
*/

public interface MyList<E> extends Collection<E>{

    /**add a new element at the specified index in this list */
    public void add(int index, E d);

    @Override /**add a new element at the end of this list */
    public default boolean add(E e){
        add(size(), e);
        return true;
    }

    /**clear the list*/
    public void clear();

    
    @Override/**returns boolean, takes in <E> */
    public boolean contains(Object e);    

    /**REturn the element from this list at the specified index */
    public E get(int intNumber);

    /**return the index of the first matching element in this list. Return -1 if no match */
    public int indexOf(Object e);

    @Override /**Return true if this list contains no elements */
    public default boolean isEmpty(){
        return size() == 0;
    }

    /**Return the index of the last matching element in this list, return -1 if no match */
    public int lastIndexOf(E e);


    @Override /**Remove the first occurrence of the element e from this list. Shift any subsequent elements to the left. 
    Return true if the element is removed. */
    public default boolean remove(Object e){
        if(indexOf(e) >= 0){
            remove(indexOf(e));
            return true;
        }else{
            return false;
        }
    }

    /**Remove the element at the specified position in this list.
    Shift any subsequent elements to the left
    Return the element that was removed from the list */
    public E remove(int index);


    /**Replace the element at the specified position in this list with the specified element and returns the new set */
    public E set(int index, E e);

    
    @Override
    public default int size(){
        return this.size();
    }
    
    /**
     * Exercised from the book below only
     * Exercised from the book below only
     * Exercised from the book below only
     */

    // @Override
    // public default boolean containsAll(Collection<?> c){
    //     //left as exercise
    //     return true;
    // }

    // @Override
    // public defualt boolean addAll(Collection<? extends E> c){
    //     //left as exercise
    //     return true;
    // }

    // @Override
    // public default boolean removeAll(Collection<?> c){
    //     //left as an exercise
    //     return true;
    // }

    // @Override
    // public default boolean retainAll(Collection<?> c){
    //     //left as an exercise
    //     return true;
    // }

    // @Override
    // public default Object[] toArray(){
    //     //left as an exercise
    //     return null;
    // }

    // @Override
    // public default <T> T[] toArray(T[] array){
    //     //left as exercise
    //     return null;
    // }

    


}











