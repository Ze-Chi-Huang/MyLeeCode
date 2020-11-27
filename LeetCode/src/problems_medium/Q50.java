package problems_medium;

public class Q50 {

	public static void main(String[] args) {
		
		System.out.println(myPow(2,-2147483648));
		Math.pow(1, 1);
	}
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
