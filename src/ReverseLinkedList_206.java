/**
 * Created by hp on 2016/10/14.
 */
public class ReverseLinkedList_206 {
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode p=reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
