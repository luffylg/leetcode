/**
 * Created by hp on 2016/10/9.
 */

public class InvertBinaryTree_226 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode invertTree(TreeNode root) {
        if (root==null){
            return null;
        }
        if ((root.left==null)&&(root.right==null)){
            return root;
        }
        TreeNode tmp=root.left;
        root.left=root.right;
        root.right=tmp;
        return root;
    }
    //先序遍历
    public void preOrderTraverse(TreeNode node){
        if (node!=null){
            System.out.print(node.val+" ");
            preOrderTraverse(node.left);
            preOrderTraverse(node.right);
        }
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
        TreeNode d=new TreeNode(9);
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
        InvertBinaryTree_226 tree_226 = new InvertBinaryTree_226();
        tree_226.preOrderTraverse(g);
        TreeNode root = tree_226.invertTree(g);
        System.out.println("");
        tree_226.preOrderTraverse(g);
    }
}
