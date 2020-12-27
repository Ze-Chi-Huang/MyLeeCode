package problems_medium;

public class Q11 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
//		int[] height = new int[] {1,8,6,2,5,4,8,3,7};
		int[] height = new int[] {4,3,2,1,4};
		
		
		System.out.println("height: " + maxArea(height));
		long end = System.currentTimeMillis();
		System.out.println(end - start);
	}
	
	// 思考 : 決定長寬，再找最大值
	// 最大面積 : MAX
	public static int maxArea(int[] height) {
		if(height.length == 0) return 0;
		
		int max = 0;
		for(int i=0; i<height.length; i++) {
			
			for(int j = i; j<height.length; j++) {
				
				int length = j-i;
				int width = Math.min(height[i], height[j]);
				int area = length * width;
				if(area > max) {
					max = area;
				}
				
			}
		}
		
		return max;
    }
}
