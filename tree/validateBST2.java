package tree;
public class validateBST2 {
    static boolean isValidBST(treeNode root){
        if(root.left != null){
            System.out.println("left "+ root.val+" "+root.left.val);
            if(root.left.val > root.val){
                return false;
            }
            else{
                isValidBST(root.left);
            }
        }
        if(root.right != null){
            System.out.println("right "+ root.val+" "+root.right.val);
            if(root.right.val < root.val){
                return false;
            }
            else{
                isValidBST(root.right);
            }
        }
        return true;
    }
    public static void main(String[] args) {
        treeNode root = new treeNode(20);
        root.left = new treeNode(15);
        root.right = new treeNode(25);
        root.left.left = new treeNode(5);
        root.left.right = new treeNode(90);
        root.right.left = new treeNode(22);
        root.right.right = new treeNode(30);
        System.out.println(isValidBST(root));
    }
}
