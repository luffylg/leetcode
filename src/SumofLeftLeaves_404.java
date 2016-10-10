/**
 * Created by hp on 2016/10/10.
 */
public class SumofLeftLeaves_404 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if (root==null){
            return 0;
        }
        if (root.left==null && root.right==null){
            return  0;
        }
        if (root.left!=null && root.left.left==null && root.left.right==null){
            return root.left.val+sumOfLeftLeaves(root.right);
        }
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }

    public static void main(String[] args) {
        TreeNode a=new TreeNode(1);
        a.right=null;
        a.left=null;
        TreeNode b=new TreeNode(3);
        b.right=null;
        b.left=null;
        TreeNode c=new TreeNode(6);
        c.right=null;
        c.left=null;
        TreeNode d=new TreeNode(0);
        d.right=null;
        d.left=null;
        TreeNode e=new TreeNode(2);
        e.right=b;
        e.left=a;
        TreeNode f=new TreeNode(7);
        f.right=d;
        f.left=c;
        TreeNode g=new TreeNode(4);
        g.right=f;
        g.left=e;
        System.out.println(new SumofLeftLeaves_404().sumOfLeftLeaves(g));
    }
}
