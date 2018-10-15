package week06;

import week06Assignment.AbstractSort;
import week06Assignment.InsertionSort;
import week06Assignment.MergeSort;
import week06Assignment.SelectionSort;

public class Practice {
	
	public static void main(String[] args) {
		
		int[] nums = new int[10];
		for(int i = 0; i<nums.length; i++) {
			nums[i] = (int) (Math.random() *10 +1);
		}
		
		System.out.print("Before Sorting: ");
		for(int i = 0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		SelectionSort newList = new SelectionSort(nums);
		newList.sort();
		for(int i = 0; i< newList.getList().length; i++) {
			System.out.print(newList.getList()[i] + " ");
		}
		System.out.print("After Sorting: "+ newList.getList());
		
		
		
	}

}
