import java.util.*;

public class GLDCheckCircle{
    public boolean chechCircle(ListNode head){
        Set<ListNode> set = new HashSet<>();
        ListNode next_node = head.next;
        while(next_node != null){
            if(! set.add(next_node))
                return true;
            next_node = next_node.next;
        }
        return false;
    }

    public static void main(String args[]){
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(2);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        //n6.next = n3;

        System.out.println(new GLDCheckCircle().chechCircle(n1));
    }

}
