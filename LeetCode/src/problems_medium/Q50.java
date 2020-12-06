package problems_medium;

public class Q50 {

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
//		System.out.println(myPow2(2,-2147483648));
		System.out.println(pow(5,6));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	//思考 : 分割法，每一次都分成2半去相乘，最後再乘起來(迴圈)
	public static double pow(double x,int n){
		if(n ==0) return 1;
		double res = 1;
		
		while(n > 0) {
			if(n % 2 !=0) {
				res *= x;
			}
			x *= x;
			n = n/2;
		}
		
		return res;
	}
	
	//思考 : 分割法，每一次都分成2半去相乘，最後再乘起來(遞迴)
	public static double myPow2(double x, int n) {

		if(n>0) {
			return pow2(x,n);
		}else {
			return 1/pow2(x,n);
		}
		
	}
	
	/*不斷的分解 n 
	Ex. 5 ^ 3
	=  5^1 * 5^1 ^ 5 
	*/
	public static double pow2(double x, int n) {
		if(n == 0) return 1;

		double y = pow2(x,n/2); //思考: 一直除以2，直到為0 
		if( n % 2 ==0) {
			return y*y;
		}else {
			return y*y*x;
		}
	}
	
	//太久了!
	public static double myPow(double x, int n) {
		//思考 : n = 0 -> 1, n > 0 -> n 方  ,n < 0 -> 1/ n 方
		if(n == 0 || x == 1) return 1;
		double value = 1;
		
		if(n > 0) {
			for(int i=0; i<n; i++) {
				value *= x;
			}
			return value;
		}
		
		if(n < 0) {
			for(int i=0; i> n; i--) {
				value *= x;
			}
			return 1/value;
		}
		
        return 0.0;
    }
}
