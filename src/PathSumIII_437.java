/**
 * Created by hp on 2016/12/8.
 */
public class PathSumIII_437 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int pathSum(TreeNode root, int sum) {
        if (root==null) return 0;
        return PathsumWithRoot(root,sum)+pathSum(root.left,sum)+pathSum(root.right,sum);
    }

    private int PathsumWithRoot(TreeNode root, int sum) {
        if (root==null) return 0;
        if (root.val==sum) return 1+PathsumWithRoot(root.left,sum-root.val)+PathsumWithRoot(root.right,sum-root.val);
        return PathsumWithRoot(root.left,sum-root.val)+PathsumWithRoot(root.right,sum-root.val);
    }
}
