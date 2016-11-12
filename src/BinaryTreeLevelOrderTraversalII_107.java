import java.util.LinkedList;
import java.util.List;

import javax.swing.text.WrappedPlainView;

public class BinaryTreeLevelOrderTraversalII_107 {
	public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode(int x) { val = x; }
	 }
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> rst=new LinkedList<>();
		wrap(rst,root,0);
		return rst;
    }
	private void wrap(List<List<Integer>> rst, TreeNode root, int i) {
		// TODO Auto-generated method stub
		if (root==null) {
			return;
		}
		
		if (i>=rst.size()) {
			List<Integer> list=new LinkedList<>();
			rst.add(0, list);
		}	
		wrap(rst, root.left, i+1);
		wrap(rst, root.right, i+1);
		rst.get(rst.size()-i-1).add(root.val);
	}
}
