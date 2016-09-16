public class ReverseLinkedList{
    public ListNode reverseList(ListNode head){
        if(null == head || null == head.next)
            return head;
        ListNode res = head.next;
        ListNode reverse_res = reverseList(res);
        res.next = head;
        head.next = null;
        return reverse_res;
    }
}
