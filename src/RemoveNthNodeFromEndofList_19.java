
public class RemoveNthNodeFromEndofList_19 {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head==null ||head.next==null&&n==1) {
			return null;
		}
		ListNode h=new ListNode(0);
		h.next=head;
		ListNode tail=h;
		for (int i = 0; i < n; i++) {
			tail=tail.next;
		}
		if (tail.next==null) {
			return h.next.next;
		}
		while (tail.next!=null) {
			h=h.next;
			tail=tail.next;
		}
		h.next=h.next.next;
		return head;
    }
}
