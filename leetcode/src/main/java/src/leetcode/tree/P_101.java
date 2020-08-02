package src.leetcode.tree;

import src.leetcode.structure.TreeNode;

/**
 * @Author zhaoyin@corp.netease.com
 * @Date 2020/8/2 10:19
 * @Version 1.0
 * @Description 对称二叉树判断
 */
public class P_101 {
    public static void main(String[] args) {

    }

    public static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        TreeNode node1=root.left;
        TreeNode node2=root.right;
        return isMirror(node1,node2);
    }

    /**
     * 关键是拆解为递归
     * @param node1
     * @param node2
     * @return
     */
    private static boolean isMirror(TreeNode node1,TreeNode node2){
        //终止条件
        if(node1==null&&node2==null){
            return true;
        }
        if(node1==null||node2==null){
            return false;
        }
        //子树递归语句
        return node1.val==node2.val&&isMirror(node1.left,node2.right)&&isMirror(node1.right,node2.left);
    }
}
