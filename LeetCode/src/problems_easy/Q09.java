package problems_easy;

public class Q09 {

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));

	}
	public static boolean isPalindrome(int x) {
        
		StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(x));
        
        return sb.toString().equals(sb.reverse().toString());
    }
}
