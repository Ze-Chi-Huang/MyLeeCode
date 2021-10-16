package algorithm.sort;

//把新元素丟到已排序的陣列
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr = new int[] {5,6,1,15,84,19,48};
//		int[] arr = new int[] {5,4,3,2,1};
		
		int[] arr_sorted = sort2(arr);
		
		for(int x : arr_sorted) {
			System.out.print(x + " ");
		}

	}

	private static int[] sort(int[] arr) {
		
		for(int i=1; i<arr.length;i++) { //初始 =1，因為將arr[0] 視為起始陣列
			
			int cur = arr[i];
			//比較cur 與 在 i之前的陣列，將cur 插入到合適的位置
			
			for(int j=0; j<i; j++) { //比較在i 之前的陣列
				
				if(cur < arr[j]) { //從前面開始比，比完把所有元素往後移到i 的位置
					
					for(int k=i; k>j;k--) { //從後開始，所有元素往後移
						arr[k] = arr[k-1];
					}
					
					arr[j] = cur;
					break;
				}
				
			}
			
		}
		
		return arr;
	}
	
	private static int[] sort2(int[] arr) {
	    int len = arr.length;
	    int preIndex;
	    int current;
	    
	    for(int i = 1; i < len; i++) {
	        preIndex = i - 1;
	        current = arr[i];
	        while(preIndex >= 0 && arr[preIndex] > current) {
	            arr[preIndex + 1] = arr[preIndex];
	            preIndex--;
	        }
	        arr[preIndex + 1] = current;
	    }
	    return arr;
	}
}
