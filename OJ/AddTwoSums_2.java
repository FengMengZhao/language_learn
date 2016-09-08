
public class AddTwoSums_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    	if(l1 == null) return l2;
    	if(l2 == null) return l1;
    	
    	ListNode head = new ListNode(0);
    	ListNode p = head;
    	int overflow = 0;
    	while(l1 != null || l2 != null){
    		int var1 = l1 == null ? 0 : l1.val;
    		int var2 = l2 == null ? 0 :l2.val;
    		int sum = var1 + var2 + overflow;
    		overflow = (sum) / 10;
    		p.next = new ListNode(sum % 10);
    		p = p.next;
    		if(l1 != null) l1 = l1.next;
    		if(l2 != null) l2 = l2.next;
    	}
    	
    	if(overflow != 0)
    		p.next = new ListNode(overflow);
    	return head.next;
    }
    
    public static void main(String arg[]){
    	AddTwoSums_2 ats = new AddTwoSums_2();
    	ListNode node1 = new ListNode(1);
    	ListNode node2 = new ListNode(8);
    	//ListNode node3 = new ListNode(5);
    	ListNode node4 = new ListNode(0);
    	//ListNode node5 = new ListNode(5);
    	//ListNode node6 = new ListNode(4);
    	node1.next = node2;
    	//node2.next = node3;
    	//node4.next = node5;
    	//node5.next = node6;
    	
    	ListNode node7 = ats.addTwoNumbers(node1, node4);
    	LinkedListNode lln = new LinkedListNode(node7);
    	System.out.println(lln);
    }
}
