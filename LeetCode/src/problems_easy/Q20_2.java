package problems_easy;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//Constraints:
//1 <= s.length <= 104
//s consists of parentheses only '()[]{}'.
public class Q20_2 {

	public static void main(String[] args) {
		
		String s = "(){}[]"; //true
		String s1 = "[()]"; //true
		String s2 = ")]"; //false
		String s3 = "("; //false
		Q20_2 clazz = new Q20_2();
		System.out.println(clazz.isValid(s));
	}
	public boolean isValid(String s) {
		//思考: 一進一出，進的: ([{ 出的: )]}
		//有一個容器存進去再取出來
		char[] c = s.toCharArray();
		Stack stack = new Stack(c.length);
		for(int i=0;i<c.length;i++) {
			switch(c[i]) {
				case '(':
				case '[':
				case '{':
					stack.push(c[i]);
					break;
				case ')':
					if(stack.size() == 0) return false;
					if(stack.pop() != '(') return false;
					break;
				case ']':
					if(stack.size() == 0) return false;
					if(stack.pop() != '[') return false;
					break;
				case '}':
					if(stack.size() == 0) return false;
					if(stack.pop() != '{') return false;
					break;
				default:
			}
			
		}
		
		return (stack.size()==0);
	}
	
	class Stack{
		
		private char[] members;
		int i; //index
		
		public Stack(int length) {
			this.members = new char[length];
			this.i=0;
		}
		
		public void push(char value) {
			members[i++] = value;
			
			//members[i] = value;
			//i++;
		}
		
		public char pop() {
			//i--;
			//return members[i];
			
			return members[--i];
		}
		
		public int size() {
			return i;
		}
	}
}
