import java.util.*;

public class LinkedListCycle_141{
    public boolean hasCycle(ListNode head){
        Set<ListNode> set = new HashSet<>();
        ListNode next_node = head;
        while(next_node != null){
            if(! set.add(next_node))
                return true;
            next_node = next_node.next;
        }
        return false;
    }

    public static void main(String args[]){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;
        System.out.println(new LinkedListCycle_141().hasCycle(node1));
    }
}
