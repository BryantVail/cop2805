package week09;




public class MyHashMapLinear extends MyMap<K, V> {
	
	private static int DEFAULT_INITIAL_CAPACITY = 4;
	
	private static int MAXIMUM_CAPACITY = 1 <<30;
	
	// current hash-table capacity. Capacity is a power of 2
	private int capacity;
	
	private static float DEFAULT_MAX_LOAD_FACTOR = .75f;
	
	//specify a load factor used in the hash table
	private float loadFactorThreshold;
	
	//the number of entries in the map
	private int size = 0;
	
	//hash table is an array with each cell being a linked list
	LinkedList<MyMap.Entry<K,V>>[] table;
	
}












