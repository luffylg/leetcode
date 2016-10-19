/**
 * Created by hp on 2016/10/19.
 */
public class LowestCommonAncestorofaBinarySearchTree_235 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int max=Math.max(p.val,q.val);
        int min=Math.min(p.val,q.val);
        int rootval=root.val;
        if(rootval==min||rootval==max||rootval>min&&rootval<max) return root;
        if (rootval<min) return lowestCommonAncestor(root.right,p,q);
        return lowestCommonAncestor(root.left,p,q);
    }
}
