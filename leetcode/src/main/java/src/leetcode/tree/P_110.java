package src.leetcode.tree;

import src.leetcode.structure.TreeNode;

/**
 * @Author zhaoyin@corp.netease.com
 * @Date 2020/8/2 15:32
 * @Version 1.0
 * @Description 判断是否为高度平衡二叉树
 */
public class P_110 {
    //求子树高度
    private int height(TreeNode root) {
        // An empty tree has height -1
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public boolean isBalanced(TreeNode root) {
        // An empty tree satisfies the definition of a balanced tree
        if (root == null) {
            return true;
        }
        if( Math.abs(height(root.left) - height(root.right)) >=2){
            return false;
        }
        // 子树循环
        return isBalanced(root.left) && isBalanced(root.right);
    }

}
