package week09_11012018;

public interface MyMap {
	
	/**Remove all of the entries from this map */
	public void clear();
	
	/**Return true if the specified key is in the map */
	public boolean containsKey(K key);
	
	/**Returns true if the map contains the specified value*/
	public boolean containsValue(V value);

}
