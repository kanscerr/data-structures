package tree;

public class treeNode {
    public int val;
    public treeNode left;
    public treeNode right;
    public treeNode(){};
    public treeNode(int val){
        this.val = val;
    }
    public treeNode(int val, treeNode left, treeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
