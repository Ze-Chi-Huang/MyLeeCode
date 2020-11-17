package problems;

public class Q21 {

	// Merge two sorted linked lists and return it as a new sorted list. 
	// The new list should be made by splicing together the nodes of the first two lists.
	
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode() {}
	 *     ListNode(int val) { this.val = val; }
	 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 * }
	 */
	
	public static void main(String[] args) {
		//ListNode l1 = [1,2,4];
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		//System.out.println(l1);
		ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		//System.out.println(l2);
		
		ListNode mergeL = mergeTwoLists(l1,l2);
		System.out.println(mergeL);
	}
	
	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		//思考 : 定義一個空的ListNode，一個一個比較 l1 跟 l2 的值，誰小就建立新的 ListNode 
		
		ListNode dummy = new ListNode();
		ListNode cur = dummy;
		while(l1 != null && l2 != null)
		{
			if(l1.val < l2.val)
			{
				//Cur先指向比較小的
				cur.next = new ListNode(l1.val);
				l1 = l1.next;
			}else
			{
				cur.next = new ListNode(l2.val);
				l2 = l2.next;
			}
			cur = cur.next;
		}
		
		//比到最後一個 : 
		if(l1 != null)
		{
			cur.next = l1;
		}else 
		{
			cur.next = l2;
		}
		
		return dummy.next;
		
    }
	
	//遞迴寫法
	private static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.val < l2.val)
		{
			l1.next = mergeTwoLists2(l1.next, l2);
			return l1;
		}else 
		{
			l2.next = mergeTwoLists2(l1, l2.next);
			return l2;
		}
		
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
    		
    		System.out.print(node.val + ",");
    		node = node.next;
    	}
		return "";
    }
}
