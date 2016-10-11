/**
 * Created by hp on 2016/10/11.
 */
public class SameTree_100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q != null) {
            if (!isSameNode(p, q)) return false;
            return  isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
        }
        return false;
    }
    private boolean isSameNode(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p != null && q != null) {
            return p.val == q.val;
        }
        return false;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
