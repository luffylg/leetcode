
public class RemoveNthNodeFromEndofList_19 {
	public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode h=new ListNode(0);
		ListNode start=h;
		h.next=head;
		ListNode tail=h;
		for (int i = 0; i < n; i++) {
			tail=tail.next;
		}
		while (tail.next!=null) {
			h=h.next;
			tail=tail.next;
		}
		h.next=h.next.next;
		return start.next;
    }
}
