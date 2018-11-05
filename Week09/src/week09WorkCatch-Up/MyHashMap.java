

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
    public MyHashMap(int initialCapacity, float loadFactorThreshold){
        if(initialCapacity> MAXIMUM_CAPACITY){
            this.capacity = MAXIMUM_CAPACITY;
        }else{
            this.capacity = trimToPowerOf2(initialCapacity);
        }
        
        this.loadFactorThreshold = loadFactorThreshold;
        table = new LinkedList[capacity];
        
    }//end MyHashmap(initialCapacity, loadFactorThreshold)
    
    @Override /**Remove all of the entries from the map */
    public void clear(){
        size = 0;
        removeEntries();
    }
    
    @Override /**return true if specified key is in the map */
    public boolean containskey(K key){
        
        if(get(key) != null){
            return true;
        }else{
            return false;
        }
    }//end containsKey(key)
    
    @Override /**return true if this map contains the value */
    public boolean containsValue(V value){
     
        for(int = 0; i < capacity; i++){
            if(table[i] != null){
                LinkedList<Entry<K,V>> bucket = table[i];
                for(Entry<K,V> entry: bucket){
                    if(entry.getValue().equals(value)){
                        return true;
                    }
                }
            }
         return false;
        }        
    }//end containsValue(V value)
    
    @Override /** return a set of entries from the map */
    public java.util.Set<MyMap.Entry<K,V>> entrySet(){
        
        java.util.Set<MyMap.Entry<K,V>> set = new java.util.HashSet<>();
        
        for(int i = 0; i< capacity; i++){
            if(table[i] != null){
                LinkedList<Entry<K,V>> bucket = table[i];
                for(Entry<K,V> entry: bucket){
                    set.add(entry);
                }
            }
        }
        return set;
        
    }//end entrySet()
    
    @Override /** return the value that matches the specified key */
    public V get(K key){
        int bucketIndex = hash(key.hashCode());
        if(table[bucketIndex] !=null{
            LinkedList<Entry<K, V>> bucket = table[bucketIndex];
            for(Entry<K, V> entry: bucket){
                if(entry.getKey().equals(key)){
                    return entry.getValue();   
                }
            }//end for
        }//end if
        return null;
    }
    
    
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
}










