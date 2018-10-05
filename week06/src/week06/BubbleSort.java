package week06;

public class BubbleSort {

	public static void BubbleSort(int[] A) {
		//bubbleSort
		
//		let A be the length of the array
//		let n be the length of the array
//		loop x from 1 to n
//			loop y for from 0 to n-2
//				compare A[y] with A[y+1]. 
//				if the first is more than the second, 
//					swap
		
		int n = A.length; 
		for(int y =1; y <=n; x++) {
			if(A[y] > A[y+1]) {
				int temp = A[y];
				A[y] = A[y+1];
				A[y+1] = temp;
			}
		}
		
	}

}
