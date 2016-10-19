public class ReverseLinkedListIterate{
    public ListNode reverseList(ListNode head){
        if(null == head || null == head.next)
            return head;
        ListNode current = head,
                 prevNode = null,
                 nextNode= null;

        while(null != current){
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        return prevNode;
    }

    public static void main(String args[]){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode current = node1;
        while(current != null){
            System.out.print(current.val + " --> ");
            current = current.next;
        }
        System.out.println();
        ListNode head = new ReverseLinkedListIterate().reverseList(node1);
        ListNode newCurrent = head;
        while(newCurrent != null){
            System.out.print(newCurrent.val + " --> ");
            newCurrent = newCurrent.next;
        }
    }
}
