
public class RemoveLinkedListElements_203 {
	public class ListNode {
		int val;
	    ListNode next;
	    ListNode(int x) { val = x; }
	}
	public ListNode removeElements(ListNode head, int val) {
        if (head==null) return null;
        if (head.val!=val) {
			head.next=removeElements(head.next, val);
			return head;
		}else {
			return removeElements(head.next, val);
		}
    }
}
