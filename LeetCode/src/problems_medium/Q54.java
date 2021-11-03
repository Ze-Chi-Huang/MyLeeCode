package problems_medium;

import java.util.ArrayList;
import java.util.List;

//Given an m x n matrix, return all elements of the matrix in spiral order.
public class Q54 {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		Q54 q54 = new Q54();
		System.out.println(q54.spiralOrder(matrix));
	}

    public List<Integer> spiralOrder(int[][] matrix) {
    	
    	List<Integer> list= new ArrayList<Integer>();
    	
    	//思考: 存一個位置矩陣，來紀錄是否已經被尋找過
    	int m = matrix.length; //row max
    	int n = matrix[0].length; //column max
    	int[][] matrix2 = new int[m][n];
    	
    	int col = 0, row = 0;
    	boolean colIncrease = true, rowIncrease = true;
    	
    	while(matrix2[row][col] == 0) {
    		
    		list.add(matrix[row][col]);
    		
    		
    		//判斷指標遞增減
    		if(colIncrease) {
    			col++;
    		}else {
    			col--;
    		}
    		
    		if(rowIncrease) {
    			row++;
    		}else {
    			row--;
    		}
    	}
    	
		return null;
    }
}
