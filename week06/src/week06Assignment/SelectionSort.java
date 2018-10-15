package week06Assignment;

/**
 * 
 * @author Bryant
 *
 */

public class SelectionSort extends AbstractSort {
	
	public SelectionSort(int[] list) {
		super("Selection Sort", list);
	}

	@Override
	public void sort() {
		
		
		for(int i = 0; i< this.m_list.length -1; i++) {
			int index = i;
			for(int j = i+1; j<this.m_list.length; j++) {
				
				if(this.m_list[j] < this.m_list[index]) {
					index = j;
				}
			}
			
			int smallerNumber = this.m_list[index];
			this.m_list[index] = this.m_list[i];
			this.m_list[i] = smallerNumber;
		}
		

	}
	
	private void swap(int[] list, int index1, int index2) {
		
		int temp;
		temp = index1;
		index1 = index2;
		index2 = temp;
		
		
		
	}

}
