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
        ListNode point=head;
        while (point!=null&&point.next!=null){
            int tmp=point.val;
            point.val=point.next.val;
            point.next.val=tmp;
            point=point.next.next;
        }
        return head;
    }
}
