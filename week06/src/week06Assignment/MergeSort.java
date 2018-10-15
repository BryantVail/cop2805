package week06Assignment;

public class MergeSort extends AbstractSort {
	
	public MergeSort(int[] ints) {
		// int start, int middle, int end
		super("Merge Sort", ints);
		
	}

	@Override
    public void sort(){

        if(this.m_list.length >1){
            int[] firstHalf = new int[this.m_list.length/2];
            
            System.arraycopy(this.m_list, 0, firstHalf, 0, this.m_list.length /2);
            sort(firstHalf);
        

        //MergeSort the other half of the split array
        int secondHalfLength = this.m_list.length - this.m_list.length /2;
        int[] secondHalf = new int[secondHalfLength];
        System.arraycopy(this.m_list, (this.m_list.length /2), secondHalf, 0, secondHalfLength);
        sort(secondHalf);

        //Merge firstHalf with secondHalf into 'list'
        merge(firstHalf, secondHalf, this.m_list);
        }
    }//end sort()
	
	//sort(int[] list) to overload the public method with no parameters.
	private void sort(int[] list) {
		
		if(list.length >1) {
			int[] firstHalf = new int[list.length/2];
			//
			System.arraycopy(list,  0,  firstHalf,  0,  list.length/2);
			//recursively use the overloaded version of 'sort([] list)'
			sort(firstHalf);
			
			int secondHalfLength = list.length - list.length/2;
			//set 'secondHalf' array to the size of the secondHalf's array
			int[] secondHalf = new int[secondHalfLength];
			System.arraycopy(list,  list.length/2,  secondHalf,  0,  secondHalfLength);
			sort(secondHalf);
			
			//merge the two halves into the main list
			merge(firstHalf, secondHalf, list);
			
		}
		
	}//end sort(int[] list)

    private void merge(int[] list1, int[] list2, int[] temp){

        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while(current1 < list1.length && current2 < list2.length){
            if(list1[current1]<list2[current2]){
                temp[current3++] = list1[current1++];
            }else{
                temp[current3++] = list2[current2++];
            }
        }//

        //these two while loops below are necessary when either 'current1' or 'current2' become empty before the other list. They allow a single list to complete executing after the first while loop with the double condition is no longer true. 
        while(current1 < list1.length){
            temp[current3++] = list1[current1++];
        }

        while(current2 < list2.length){
            temp[current3++] = list2[current2++];
        }

    }//end merge(int[], int[], int[])
    
    public String printList() {
    	return this.m_list.toString();
    }
    
//    @Override
//    public String toString() {
//    	String[] intList = new ArrayList(this.m_list.length);
//    	for(int i = 0; i<this.m_list.length; i++) {
//    		intList[i] = this.m_list[i];
//    	}
//    	return (String) this.m_list;
//    }

}
