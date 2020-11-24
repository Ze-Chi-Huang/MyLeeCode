package problems_easy;

public class Q28 {

	public static void main(String[] args) {
		System.out.println(strStr("abcd123", "123") );
	}

	//思考 : 實做indexOf : 順序的從haystack 取 needle長度的子字串去做比對
	public static int strStr(String haystack, String needle) {

        if(needle.length() == 0) return 0;
		char[] array = haystack.toCharArray();
		for(int i=0; i < haystack.length() - needle.length() +1 ; i++)
		{
			if(needle.equals(haystack.substring(i, i + needle.length())))
			{
				return i;
			}
		}
		
		return -1;
    }
}
