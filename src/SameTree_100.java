/**
 * Created by hp on 2016/10/11.
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return p == null && q == null || p != null && q != null && isSameNode(p, q) && isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }
    private boolean isSameNode(TreeNode p, TreeNode q) {
        return p == null && q == null || p != null && q != null && p.val == q.val;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
