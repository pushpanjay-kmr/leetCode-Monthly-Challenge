package com.hashinclude.june.twenty.one;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author pushpanjay.kumar created on 1/6/20
 */
public class Driver {

    private static TreeNode createTree(){
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        return root;
    }

    private static void levelOrderTraversal(TreeNode root){
        System.out.println();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int n = queue.size();
            for(int i=0;i<n;i++){
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");

                if(node.left!=null){
                    queue.add(node.left);
                }

                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TreeNode root = createTree();
        levelOrderTraversal(root);

        Solution s = new Solution();
        TreeNode invertedTree = s.invertTree(root);
        levelOrderTraversal(invertedTree);
    }
}
