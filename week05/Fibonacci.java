package week05Project;

public class Fibonacci {

	//long fib(long index) calculates the fibonacci number at the spcified index. 
	
	public long fib(long index) {
		
		if(index ==0) {
			//System.out.println("return 0;");
			return 0;
		}else if(index  ==1){
			//System.out.println("return 1;");
			return 1;
		}else {
			//System.out.println("else block fib(index -1)+fib(index -2)");
			return fib(index -1)+ fib(index -2);
		}
		
	}
	
	public long fibImproved(long index) {
		
		long f0 = 0;
		long f1 = 1;
		long f2 = 2;
		
		//if index < 3 use this logic & return f2
		if(index == 0) {
			System.out.println("return 0;");
			return f0;
		}else if(index ==1) {
			System.out.println("return 1;");
			return f1;
		}else if(index ==2){
			System.out.println("else block fib(index "
					+ "-1)+fib(index -2)");
			return f2;
		}
		
		//for index >2, use this logic & return f2
		for(int i = 3; i<= index; i++) {
			f0 = f1;
			f1 = f2;
			f2 = f0 + f1;
			System.out.println("for loop has cycled, index: "+index);
		}
		System.out.println(f2);
		return f2;
		
	}
	
}
