package problems_easy;

public class Q09 {

	public static void main(String[] args) {
		Q09 q09 = new Q09();
		System.out.println(q09.isPalindrome(100));

	}
//	public static boolean isPalindrome(int x) {
//        
//		StringBuilder sb = new StringBuilder();
//        sb.append(String.valueOf(x));
//        
//        return sb.toString().equals(sb.reverse().toString());
//    }

	public static int count(int num, int n) {// 寫一個方法，得出輸入值的第n個位數是多少,
		// 12345 的第1位數是5

		int temp = (int) (num % Math.pow(10, n));
		return (int) (temp / Math.pow(10, n - 1));
	}

	public static boolean isPalindrome(int x) {
		// 輸入值的總位數
		if (x < 0) {
			return false;
		}
		int total = (int) (Math.log10(x) + 1);
		if (total % 2 == 1) { // 總位數是奇數
			System.out.println("奇數");
			for (int i = 0; i <= total / 2 - 1; i++) {// 對於每一個位數
				System.out.println(count(x, i + 1));
				System.out.println(count(x, total - i));
				if (count(x, i + 1) != count(x, total - i)) {
					return false;
				}
			}
			return true;
		} else { // 總位數是偶數
			System.out.println("偶數");
			for (int i = 0; i < total / 2; i++) {// 對於每一個位數

				if (count(x, i + 1) != count(x, total - i)) {
					return false;
				}
			}
			return true;
		}

	}
}
