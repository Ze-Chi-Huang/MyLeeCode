package algorithm;

public class PrintStar {

/**********
 使用者輸入int n ，產生相對應的star
	 *     
    ***    
   *****   
  *******  
   *****  
    *** 
	 *
**********/
	public static void main(String[] args) {
		
		int n = 10;
		printStars(n);
		
		long start = System.currentTimeMillis();
		
		//放函式
		go(n);
		
		long end = System.currentTimeMillis();
		
		System.out.println("花費時間" + (end - start));
	}
	
    public static void go(int n) {       
        //列數 = 2n-1
        //每一列有幾個空間:2n-1
        //在上半部，第k列有幾個左方空格:[(2n-1)-(2k-1)]*0.5 = n-k
        //在上半部，第k列有幾個中間圖按:2*k-1
        //在上半部，第k列有幾個右方空格:n-k
        //中心點:第n列
        //過中線之後是對稱的，列數遞減
        int line = 1;//第一列
        for(int i=1;i<=2*n-1;i++) {//i = 第幾列，是真實列數
            if(i<n) {//上半部
                for(int k=1;k<=n-line;k++) {
                    System.out.print(" ");
                }
                for(int k=1;k<=2*line-1;k++) {
                    System.out.print("x");
                }
                for(int k=1;k<=n-line;k++) {
                    System.out.print(" ");
                }
                line++;
                System.out.println();
            }
            else if(i==n) {
                for(int k=1;k<=2*n-1;k++) {
                    System.out.print("x");
                }
                System.out.println();
                line = line-1;
            }           
            else if (i>n){//下半部
                for(int k=1;k<=n-line;k++) {
                    System.out.print(" ");
                }
                for(int k=1;k<=2*line-1;k++) {
                    System.out.print("x");
                }
                for(int k=1;k<=n-line;k++) {
                    System.out.print(" ");
                }
                               
                System.out.println();
                line--;
               
            }
           
           
           
        }
       
       
    }

	private static void printStars(int n) {
		
		for(int i=1;i<=2*n-1;i++) {
			
			for(int j=1;j<=2*n-1;j++) {
				
				int index = (i>n) ? (n-i+n) : i ;
				
				if(j <= n + Math.abs(index-1) && j >= n- Math.abs(index-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
		}
		
	}

}
