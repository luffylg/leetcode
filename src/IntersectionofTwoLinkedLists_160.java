/**
 * Created by hp on 2016/12/8.
 */


public class IntersectionofTwoLinkedLists_160 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA==null||headB==null) return null;
        ListNode nodea=headA;
        ListNode nodeb=headB;
        while (nodea!=nodeb){
            nodea=nodea==null?headB:nodea.next;
            nodeb=nodeb==null?headA:nodeb.next;
        }
        return nodea;
    }
}
