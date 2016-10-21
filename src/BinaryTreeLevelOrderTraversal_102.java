import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2016/10/21.
 */
public class BinaryTreeLevelOrderTraversal_102 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<List<Integer>>();
        int level=0;
        order(root,lists,level);
        return lists;
    }
    private void order(TreeNode root, List<List<Integer>> lists, int level) {
        if (root==null) return;
        if (level>=lists.size()) lists.add(new ArrayList<Integer>());
        lists.get(level).add(root.val);
        order(root.left,lists,level+1);
        order(root.right,lists,level+1);
    }
}
