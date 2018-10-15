
public class MergeSort extends AbstractSort{
//shelled: true

    public MergeSort(int[] list){

    }

    @Override
    public void sort(int[] list, int first, int second){

        if(list.length >1){
            int[] firstHalf = new int[list.length/2];
            System.arraycopy(list, 0, firstHalf, 0, list.length /2);
            mergeSort(firstHalf);
        }

        //MergeSort the other half of the split array
        int secondHalfLength = list.length - list.length /2;
        int[] secondHalf = new int[secondHalfLength];
        System.arraycopy(list, list.length /2), secondHalf, 0, secondHalfLength);
        mergeSort(secondHalf);

        //Merge firstHalf with secondHalf into 'list'
        merge(firstHalf, secondHalf, list);

    }

    public void merge(int[] list1, int[] list2, int[] temp){

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
            temp[current3++ = list2[current2++];
        }

    }

    public void sortArray(int[] list, int first, int last){

    }




}








