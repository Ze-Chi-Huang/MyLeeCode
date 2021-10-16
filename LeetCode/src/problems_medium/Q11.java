package problems_medium;

import java.util.ArrayList;
import java.util.List;

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
	
	   public static int maxArea2(int[] height) {
		   
	        int width=0;
	        int height_1 =0;
	        int area =0;
	        List<Integer> alist = new ArrayList<Integer>();
	        for(int i=0;i<height.length;i++) {
	            for(int j=0;j<height.length;j++) {
	                //高度=ar[i]跟ar[j]中較小者
	                //寬度=Math.abs(i-j)
	                if(height[i]>=height[j]) {
	                    height_1=height[j];
	                }
	                else {
	                    height_1=height[i];
	                }
	                width = Math.abs(i-j);
	                area = height_1*width;
	                alist.add(area);
	                //System.out.println(area);
	               
	            }
	           
	        }
	       
	        int comparedValue =0;
	        int maxValue=alist.get(0);
	        for(int k=0;k<alist.size();k++) {
	            comparedValue = alist.get(k);
	            if(comparedValue > maxValue) {
	                maxValue = comparedValue;
	            }
	        }
	            return maxValue;
	     
        }
}
