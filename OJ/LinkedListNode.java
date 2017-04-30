
public class LinkedListNode {
	private ListNode head;
	public LinkedListNode(ListNode head){
		this.head = head;
	}
	public String toString(){
		if(head == null) return null;
		ListNode next = head;
		StringBuilder sb = new StringBuilder();
		while(next != null){
			sb.append(next.val + "->");
			next = next.next;
		}
		return (sb.toString()).substring(0, sb.toString().length()-2);
	}
}
