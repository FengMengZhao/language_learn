public class MergeTwoSortedLists_21{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(null == l1)
            return l2;
        if(null == l2)
            return l1;
        ListNode head = null;
        if(l1.val < l2.val){
            head = new ListNode(l1.val);
            head.next = mergeTwoLists(head.next, l2);
        }else{
            head = new ListNode(l2.val);
            head.next = mergeTwoLists(l1, l2.next);
        }
        return head;
    }
}
