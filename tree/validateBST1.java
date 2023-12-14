package tree;
public class validateBST1 {
    static boolean isBST(treeNode root, int min, int max){
        if(root == null){
            return true;
        }
        if(root.val < min || root.val > max){
            return false;
        }
        return isBST(root.left, min, root.val-1) && isBST(root.right, root.val+1, max);
    }
    static boolean isValidBST(treeNode root){
        return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public static void main(String[] args) {
        treeNode root = new treeNode(20);
        root.left = new treeNode(15);
        root.right = new treeNode(25);
        root.left.left = new treeNode(5);
        root.left.right = new treeNode(18);
        root.right.left = new treeNode(22);
        root.right.right = new treeNode(30);
        System.out.println(isValidBST(root));
    }
}
