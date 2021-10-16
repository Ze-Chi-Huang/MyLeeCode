package algorithm;

public class SevenScreen {

	public static void main(String[] args) {
		
		int count = 0;
		for(int hour=0;hour<24;hour++) {
			for(int min=0;min < 60; min++) {
				for(int sec=0; sec<60; sec++) {
					
					if(countStroke(hour) + countStroke(min) + countStroke(sec) == 30) {
						count++;
					}
					
				}
			}
		}
		System.out.println(count);
	}
	
	public static final int[] strokes = {6,2,5,5,4,5,6,3,7,6}; //對應 : index : 0 = 6筆劃, 1= 2筆劃
	
	public static int countStroke(int number) {
		
		int tens_digit = number / 10; //十位數
		int units_digit = number % 10; //個位數
		
		return strokes[tens_digit] + strokes[units_digit];
		
	}

}
