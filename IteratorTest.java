


public class IteratorTest extends java.lang.Object {
	
	private int m_listSize;
	private StopWatch m_watch;
	private LinkedList<Integer> linkedList;
	private long m_iteratorElapsedTime;
	private long m_getAtElapsedTime;
	
	public IteratorTest(int listSize){
		
		m_listSize = listSize;
		m_watch = new StopWatch();
		initialize();
		
	}//end IteratorTest(int listSize)
	
	public void execute(){
		
		Iterator<Integer> iter = m_linkedList.listIterator();
		m_watch.start();
		while(iter.hasNext()){
			Integer integer = iter.next();
		}
		m_watch.stop();
		m_iteratorElapsedTime = m_watch.getElapsedTimeMilliseconds();
		
		m_watch.start();
		for(int i = 0; i < m_linkedList.size(); ix++){
			
			Integer integer = m_linkedList.get(index);
			
		}
		m_watch.stop();
		m_getAtElapsedTime = m_watch.getElapsedTimeMilliseconds();		
		
	}//end execute()
	
	public long getIteratorElapsedTimeInMilliseconds(){
		return m_iteratorElapsedTime;
	}//end getIteratorElapsedTimeInMilliseconds
	
	public long getElapsedTimeInMilliseconds(){
		return m_getAtElapsedTime;
	}//end getElapsedTimeInMilliseconds
	
	public long getListSize(){
		
		return /*(long)*/ m_linkedList.getSize();
		
	}//end getListSize()
	
	public void initialize(){
		
		m_linkedList = new LinkedList<Integer>();
		for(int data = 0; data<m_listSize; data++){
			m_linkedList.add(data);
		}//end for
		
	}//end initialize()
	
	
}//end class IteratorTest











