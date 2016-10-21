import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
        if (root==null) return lists;
        Queue<TreeNode> qe=new LinkedList<>();
        qe.offer(root);
        while (!qe.isEmpty()){
            int len=qe.size();
            ArrayList<Integer> integers = new ArrayList<>();
            for (int i = 0; i <len ; i++) {
                if (qe.peek().left!=null) qe.offer(qe.peek().left);
                if (qe.peek().right!=null) qe.offer(qe.peek().right);
                integers.add(qe.poll().val);
            }
            lists.add(integers);
        }
        return lists;
    }
}
