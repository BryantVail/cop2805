package week06;

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
		
		
		
	}

}
