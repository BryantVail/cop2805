package week04.week04_assignment;



public class WordCountResult {
	
	private int m_count;
	private String m_word;
	
	public int getCount() {
		return this.m_count;
	}
	
	public String getWord() {
		return this.m_word;
	}
	
	public void incrementCount() {
		this.m_count++;
	}
	
	public void setCount(int newCount) {
		this.m_count = newCount;
	}
	
	public String toString() {
		return (this.m_count + "\t"+ this.m_word);
	}
	
	public WordCountResult(int count, String word) {
		this.m_count = count;
		this.m_word = word;
	}
	
	
}











