import java.util.ArrayList;

/**
 * Created by hp on 2016/10/23.
 */
public class LinkedListCycle_141 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public boolean hasCycle(ListNode head) {
        while (head!=null){
            ListNode tmp=head.next;
            if (head.next==head) return true;
            head.next=head;
            head=tmp;
        }
        return false;
    }
}
