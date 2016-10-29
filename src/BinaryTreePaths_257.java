import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2016/10/29.
 */
public class BinaryTreePaths_257 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result=new ArrayList<String>();
        if (root==null) return result;
        if (root.left==null&&root.right==null){
            result.add(String.valueOf(root.val));
            return result;
        }
        for (String st:binaryTreePaths(root.left)) {
            result.add(String.valueOf(root.val)+"->"+st);
        }
        for (String st:binaryTreePaths(root.right)) {
            result.add(String.valueOf(root.val)+"->"+st);
        }
        return result;
    }
}
