package problems_easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Q20 {

	public static void main(String[] args) {
		
		String s = "()[()]";
		System.out.println(isValidParentheses2(s));
	}
	//Given a string s containing just the characters 
	//'(', ')', '{', '}', '[' and ']', determine if the input string is valid.
	
	// : 雖然pass，但很不好讀
	private static boolean isValidParentheses2(String s) {
		
		Stack<Character> stack = new Stack<Character>();
		char[] arr = s.toCharArray();
		Character c ;
		for(int i=0; i<arr.length; i++)
		{
			switch(arr[i]) {
				case '(':
					stack.push('(');
					break;
				case ')':
					if(stack.isEmpty()) return false;
					c = stack.pop();
					if('(' != c) return false;
					break;
				case '[':
					stack.push('[');
					break;
				case ']':
					if(stack.isEmpty()) return false;
					c = stack.pop();
					if('[' != c) return false;
					break;
				case '{':
					stack.push('{');
					break;
				case '}':
					if(stack.isEmpty()) return false;
					c = stack.pop();
					if('{' != c)  return false;
					break;
			}
			
		}
		
		return stack.isEmpty();
		
	}
	
	// : ([)] 錯誤，沒有考慮到成雙成對
	private static boolean isValidParentheses(String s) {

		//思考 : 有左括號，就要配一個右括號 
		int sLeft = 0;
		int mLeft = 0;
		int lLeft = 0;
		
		char[] arr = s.toCharArray();
		for(int i=0; i<arr.length; i++)
		{
			switch(arr[i]) {
				case '(':
					sLeft++;
					break;
				case ')':
					sLeft--;
					break;
				case '[':
					mLeft++;
					break;
				case ']':
					mLeft--;
					break;
				case '{':
					lLeft++;
					break;
				case '}':
					lLeft--;
					break;
			}
			
			if(sLeft <0 || mLeft <0 || lLeft<0) return false;
		}
		
		return (sLeft == 0 && mLeft == 0 && lLeft == 0);
	}

}
