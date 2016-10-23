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
        ArrayList<ListNode> list = new ArrayList<>();
        while (head!=null){
            if (list.contains(head)) return true;
            list.add(head);
            head=head.next;
        }
        return false;
    }
}
