package problems_medium;

public class Q03 {

	public static void main(String[] args) {
		
		String s = " ";//pwwkew
		System.out.println(lengthOfLongestSubstring(s));
	}
	
	//直觀思考 : 字串不重複 + 子字串
	public static int lengthOfLongestSubstring(String s) {
		//找最長的子字串
		if(s == null || s.equals("")) return 0;
		
		
		char[] charArray = s.toCharArray();
		
		int maxLen = 0;
		
		for(int n=0; n<charArray.length;n++) {
			String subStr = "";
			for(int i=n; i< charArray.length; i++) { 
				//條件1 : 不重複
				if(!subStr.contains(Character.toString(charArray[i]))) {
					
					subStr += charArray[i];
					if(subStr.length() > maxLen) maxLen = subStr.length();
					//也可用指標代替:
//					if(i-n+1 > maxLen) maxLen = i-n+1;
					
				}else {
					//條件2 : 子字串
					break;
				}
			}
		}
		
		return maxLen;
	}

}
