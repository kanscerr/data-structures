package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class inOrderTraversal {
    static ArrayList<Integer> inOrder(treeNode root){
        ArrayList<Integer> list = new ArrayList<>();
        treeNode cur = root;
        if(cur == null){
            return list;
        }
        Stack<treeNode> stack = new Stack<>();
        while(cur != null || !stack.isEmpty()){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            list.add(cur.val);
            cur = cur.right;
        }
        return list;
    }

    public static void main(String[] args) {
        treeNode root = new treeNode(20);
        root.left = new treeNode(15);
        root.right = new treeNode(25);
        root.left.left = new treeNode(5);
        root.left.right = new treeNode(18);
        root.right.left = new treeNode(22);
        root.right.right = new treeNode(30);
        System.out.println(inOrder(root));
    }
}
