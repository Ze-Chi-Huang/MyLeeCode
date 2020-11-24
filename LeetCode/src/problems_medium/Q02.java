package problems_medium;


public class Q02 {

	//add two number
	public static void main(String[] args) {
		//ListNode l1 = [1,2,4];
		ListNode l1 = new ListNode(3, new ListNode(4, new ListNode(3,new ListNode(3))));
		ListNode l2 = new ListNode(8, new ListNode(4, new ListNode(3)));
		System.out.println(addTwoNumbers(l1,l2));
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		//思考 : 從第一個node 開始加，若大於10 則 下一個node 進位
		ListNode returnNode = new ListNode();
		ListNode newNode = new ListNode();
		returnNode.next = newNode;
		ListNode cur1 = l1;
		ListNode cur2 = l2;
		
		boolean AddOne = false;
		while(cur1 != null || cur2 != null) { //只要有一個不為null，就要做
			
			ListNode cur = new ListNode();
			int tempVal = AddOne ? 1: 0;
			int cur1Val = (cur1 != null)?cur1.val:0;
			int cur2Val = (cur2 != null)?cur2.val:0;
			
			if((cur1Val + cur2Val + tempVal) >= 10 ) {
				cur.val = (cur1Val + cur2Val + tempVal) % 10;
				//下一個要進位
				AddOne = true;
			}else {
				cur.val = cur1Val + cur2Val + tempVal;
				AddOne = false;
			}
			newNode.next = cur;
			newNode = newNode.next;
			
			if(cur1 != null) {
				cur1 = (cur1.next != null)?cur1.next:null;
			}
			if(cur2 != null) {
				cur2 = (cur2.next != null)?cur2.next:null;
			}
			
		}
		
		if(AddOne) newNode.next = new ListNode(1);
		
        return returnNode.next.next;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      @Override
      public String toString() {
      	ListNode node = this;
      	while(node!= null)
      	{
      		
      		System.out.print(node.val + " ");
      		node = node.next;
      	}
  		return "";
      }
}