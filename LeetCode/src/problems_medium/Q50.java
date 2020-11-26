package problems_medium;

public class Q50 {

	public static void main(String[] args) {
		
		System.out.println(myPow(1,2147483647));
		
	}
	public static double myPow(double x, int n) {
		//思考 : n = 0 -> 1, n > 0 -> n 方  ,n < 0 -> 1/ n 方
		double value = 1;
		if(n == 0) return 1;
		if(n > 0) {
			for(int i=0; i<n; i++) {
				value *= x;
			}
			return value;
		}
		
		if(n < 0) {
			for(int i=0; i<-n; i++) {
				value *= x;
			}
			return 1/value;
		}
		
        return 0.0;
    }
}
