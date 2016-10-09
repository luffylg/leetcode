/**
 * 创建二叉树
 */
public class BinaryTree {
    private treenode root;
    //数据类
    private static class Data{
        int age;

        public Data(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        String name;
        @Override
        public String toString() {
            return "Data{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
    //节点类
    private static class treenode{
        treenode leftnode;
        treenode rightnode;
        Data data;
        public treenode(treenode leftnode, treenode rightnode, Data data) {
            this.leftnode = leftnode;
            this.rightnode = rightnode;
            this.data = data;
        }
    }
    //获取树高
    private int getTreeHeight(treenode rootnode){
        return rootnode==null?0:1+Math.max(getTreeHeight(rootnode.leftnode),getTreeHeight(rootnode.rightnode));
    }
    //创建节点
    private treenode createnode(treenode leftnode, treenode rightnode, Data data){
        return new treenode(leftnode, rightnode, data);
    }

    //先序遍历
    public void preOrderTraverse(treenode node){
        if (node!=null){
            System.out.println(node.data+"");
            preOrderTraverse(node.leftnode);
            preOrderTraverse(node.rightnode);
        }
    }
    //中序遍历
    public void inOrderTraverse(treenode node){
        if (node!=null){

            inOrderTraverse(node.leftnode);
            System.out.println(node.data+"");
            inOrderTraverse(node.rightnode);
        }
    }
    //后序遍历
    public void postOrderTraverse(treenode node){
        if (node!=null){

            postOrderTraverse(node.leftnode);
            postOrderTraverse(node.rightnode);
            System.out.println(node.data+"");
        }
    }
//    //通过name返回node
//    public treenode getnodebyname(String name,treenode node){
//        treenode newnode=null;
//        try {
//            Traverse(name,node,newnode);
//        }
//        catch (Exception e){
//            return newnode;
//        }
//        System.out.println("no data");
//        return newnode;
//    }
//    public void Traverse(String name,treenode node,treenode newnode) throws Exception {
//
//        if (node!=null){
//            if (node.data.getName().equals(name))
//                newnode=node;
//                throw new Exception("blahblah");
//            Traverse(name,node.leftnode,newnode);
//            Traverse(name,node.rightnode,newnode);
//        }
//
//    }


    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        treenode d=bt.createnode(null,null,new Data(4,"d"));
        treenode e=bt.createnode(null,null,new Data(5,"e"));
        treenode f=bt.createnode(null,null,new Data(7,"f"));
        treenode b=bt.createnode(d,e,new Data(2,"b"));
        treenode c=bt.createnode(null,f,new Data(3,"c"));
        treenode a=bt.createnode(b,c,new Data(1,"a"));
        bt.root=a;
        bt.postOrderTraverse(a);
    }
}
