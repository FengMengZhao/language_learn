public class RemoveDuplicateFromSortedList_83{
    public ListNode deleteDuplicates(ListNode head){
        if(null == head || null == head.next)
            return head;
        ListNode current = head;
        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;// don't move the cursor
            }else
                current = current.next;// move the cursor
        }
        return head;
    }

    public static void main(String args[]){
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        head.next = second;
        second.next = third;
        third.next = new ListNode(3);
        third.next.next = new ListNode(3);
        head = new RemoveDuplicateFromSortedList_83().deleteDuplicates(head);
        while(head != null){
            System.out.print(head.val + ", ");
            head = head.next;
        }
        
    }
}
