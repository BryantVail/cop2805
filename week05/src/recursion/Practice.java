package recursion;

public class Practice {

	public static void main(String[] args) {

		System.out.println("Sum of numbers us to 10 is: " +SumUpTo(10));
		

	}
	
	//recursive
	public static int SumUpToRecursive(int n) {
		if(n==1) {
			return 1;
		}else {
			return n + SumUpToRecursive(n-1);
		}
	}
	
	//normal
	public static int SumUpTo(int n) {
		
		int sum = 0;
		for(int i = 1;i<=n; i++) {
			sum +=i;
		}
		return sum;		
	}

}
