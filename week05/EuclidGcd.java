package week05Project;

/**
 * 
 * @author bvail
 * 
 * 
 */

public class EuclidGcd {

	
	//constructor
	public EuclidGcd() {
		//initialize
		
		
	}
	
	private long getEuclidGcdBreak(long m, long n) {
		
		int gcd = 1;

		if(m % n == 0){
			return n;
		}

		for(int k = n /2; k >= 1; k--){
			if(m % k == 0 && n % k ==0){
				gcd = k;
				break;
			}
		}
		return gcd;
	}
	
	public long start(long m, long n) {
		return getEuclidGcdBreak(m, n);
	}
	
	
}
