

import java.util.LinkedList;

public class MyHashMap<K, V> implements MyMap<K, V>{
 
    //default hashTable size
    private static int DEFAULT_INITIAL_CAPACITY;
    
    //default max-capacity
    private static int MAXIMUM_CAPACITY  = 1 <<30;
    
    //current hash-table capacity. capacity is a power of 2
    private int capacity;
    
    //default load factor
    private static float DEFAULT_MAX_LOAD_FACTOR = .75f;
    
    //load factor used in the hashTable
    private float loadFactorThreshold;
    
    //number of entries in the map
    private int size = 0;
    
    //hash table is an array with each cell being a linked list
    LinkedList<MyMap.Entry<K,V>>[] table;
    
    /** construct a map with the default capacity & load factor */
    public MyHashMap(){
        this(DEFAULT_INITIAL_CAPACITY, DEFAULT_MAX_LOAD_FACTOR);   
    }
    
    /** construct a map with the specified initial capacity & load factor */

    
    
    
}










