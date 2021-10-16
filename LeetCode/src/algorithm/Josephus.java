package algorithm;

public class Josephus {
	/*
	 * 約瑟夫（Josephus）有過以下的故事：在羅馬人佔領喬塔帕特後，40個猶太士兵與約瑟夫躲到一個洞中，眼見脫逃無望，一群人決定集體自殺，
	 * 然而私下約瑟夫與某個傢伙並不贊成，於是約瑟夫建議自殺方式，41個人排成圓圈，由第1個人 開始報數，每報數到3的人就必須自殺，然後由下一個重新報數，
	 * 直到剩下兩人為止。
	 * 請問約瑟夫與那傢伙要排在哪個位置才不會死?
	 * 
	 * 
	 * 約瑟夫與不想自殺的那個人分別排在第16個與第31個位置，於是逃過了這場死亡遊戲。
	 * 
	 * */
	public static void main(String[] args) {
		
		josephus1(); //普通陣列
		josephus2(); //linkedList
	}

	private static void josephus2() {
		
		
	}

	private static void josephus1() {
		int[] circle = new int[41];
		int deathNum = 1;//死亡順序
		int index = 0; //成員編號
		int count = 0;//數到三就會掛
		
		while(deathNum <= 41) {
			
			//沒死才能數
			if(circle[index % 41] == 0) {
				count++;
			}
			
			if(count == 3) {
				circle[index % 41] = deathNum;
				deathNum++;
				count = 0; //重數
			}
			index++;
		}

		for(int i=0; i<41; i++) {
			if(circle[i] == 40 || circle[i] == 41) {
				System.out.println("編號 : " + (i+1) + "沒死");
			}
		}
	}

}

class Circle{
	
	//幾個節點
	private int num;
	private Node first;
	
	public Circle(int num) {
		
	}
	
	private void showNode() {
		
		Node cur = first.getNext();
		
	}
	
}

class Node{
	
	private int no;
	private Node next;
	
	
	
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	private int deathNo;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}

	public int getDeathNo() {
		return deathNo;
	}
	public void setDeathNo(int deathNo) {
		this.deathNo = deathNo;
	}
	
}