/**
 * Created by hp on 2016/10/22.
 */
public class SymmetricTree_101 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isSymmetric(TreeNode root) {
        return root == null || cmp(root.left, root.right);
    }
    public boolean cmp(TreeNode left,TreeNode right){
        if (left==null||right==null) return left==null&&right==null;
        return left.val==right.val&&cmp(left.left,right.right)&&cmp(left.right,right.left);
    }
}
