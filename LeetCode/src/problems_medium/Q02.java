package problems_medium;


public class Q02 {

	//add two number
	public static void main(String[] args) {
		//ListNode l1 = [1,2,4];
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
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
			if((cur1.val + cur2.val + tempVal) > 10 ) {
				cur.val = (cur1.val + cur2.val + tempVal) % 10;
				//下一個要進位
				AddOne = true;
			}else {
				cur.val = cur1.val + cur2.val + tempVal;
				AddOne = false;
			}
			newNode.next = cur;
			newNode = newNode.next;
			
			cur1 = (cur1.next != null)?cur1.next:null;
			cur2 = (cur2.next != null)?cur2.next:null;
		}
		
		
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