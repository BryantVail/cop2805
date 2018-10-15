package week06Assignment;

/**
 * 
 * @author Bryant
 *
 */

public class InsertionSort extends AbstractSort {
	
	public InsertionSort(int[] list) {
		
		super("Insertion Sort", list);
		
	}

	@Override
	public void sort() {
		 
		for(int i = 1; i< this.m_list.length; i++) {
			/**
			 * Insert list[i] into a sorted sublist list[i..i-1] so that
			 * list[0..i] is sorted
			 */
			
			int currentElement = this.m_list[i];
			int k;
			
			//nested
			for(k= i-1; k>= 0 && this.m_list[k] > currentElement; k--) {
				this.m_list[k+1] = this.m_list[k]; 
			}//end 2nd level for loop
			
			//insert the current element into list[k+1]
			this.m_list[k+1] = currentElement;
		}//end outer for loop

	}
	
	private void sort(int[] list) {
		
	}

}
