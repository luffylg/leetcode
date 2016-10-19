/**
 * Created by hp on 2016/10/19.
 */
public class SwapNodesinPairs_24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode swapPairs(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode er=head.next;
        head.next=swapPairs(er.next);
        er.next=head;
        return er;
    }
}
