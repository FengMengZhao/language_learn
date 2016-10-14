public class WangSuMergeTwoSortedLists{
    public ListNode merge(ListNode headOne, ListNode headAnother){
        if(null == headOne)
            return headAnother;
        if(null == headAnother)
            return headOne;
        ListNode head = headOne;
        head.next = merge(headOne.next, headAnother);
        return head;
    }

    public static void main(String args[]){
        ListNode n1 = new ListNode(11);
        ListNode n11 = new ListNode(2);
        ListNode n12 = new ListNode(31);
        ListNode n13 = new ListNode(4);
        ListNode n14 = new ListNode(5);
        ListNode n2 = new ListNode(61);
        ListNode n21 = new ListNode(7);
        ListNode n22 = new ListNode(81);
        ListNode n23 = new ListNode(9);
        ListNode n24 = new ListNode(10);
        n1.next = n11;
        n11.next = n12;
        n12.next = n13;
        n13.next = n14;
        n2.next = n21;
        n21.next = n22;
        n22.next = n23;
        n23.next = n24;
        ListNode res = new WangSuMergeTwoSortedLists().merge(n1, n2);
        ListNode current = res;
        while(current != null){
            System.out.print(current.val + " --> ");
            current = current.next;
        }
    }
}

