/**
 * Created by hp on 2016/10/17.
 */
public class RemoveDuplicatesfromSortedList_83 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null) return head;
        while (head.next!=null&&head.val==head.next.val){
            head.next=head.next.next;
        }
        head.next=deleteDuplicates(head.next);
        return head;
    }
}
