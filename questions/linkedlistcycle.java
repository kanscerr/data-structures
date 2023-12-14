package questions;
import LinkedList.ListNode;

import java.util.LinkedList;

public class linkedlistcycle {
    public static boolean findCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(slow != null && fast != null){
            System.out.println("slow: "+slow.val+" fast: "+fast.val);
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4, head.next);

        System.out.println(findCycle(head));
    }
}
