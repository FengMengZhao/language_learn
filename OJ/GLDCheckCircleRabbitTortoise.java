public class GLDCheckCircleRabbitTortoise{
    public boolean checkCircle(ListNode head){
        ListNode slow = head.next;
        ListNode fast = null;
        if(slow != null)
            fast = head.next.next;
        else return false;

        while(fast != null){
            if(fast == slow)
                return true;
            slow = slow.next;
            if(slow != null)
                fast = fast.next.next;
            else return false;
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
        n6.next = n3;

        System.out.println(new GLDCheckCircleRabbitTortoise().checkCircle(n1));
    }
}
