/*
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
public class SwapNodesInPairs_24 {
    public ListNode swapPairs(ListNode head) {
        if(null == head || null == head.next)
            return head;
        ListNode tmp = head;
        ListNode tmp_next = head.next.next;
        head = head.next;
        tmp.next = null;
        head.next = tmp;
        if(tmp_next != null)
            head.next.next = swapPairs(tmp_next);
        return head;
    }

    public static void main(String args[]){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        head.next = second;
        second.next = third;
        third.next = four;
        four.next = five;

        head = new SwapNodesInPairs_24().swapPairs(head);
        ListNode current = head;
        while(current!= null){
            System.out.print(current.val + ", ");
            current= current.next;
        }
    }
}
