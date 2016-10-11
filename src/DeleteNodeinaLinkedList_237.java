/**
 * Created by hp on 2016/10/11.
 */
public class DeleteNodeinaLinkedList_237 {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}
