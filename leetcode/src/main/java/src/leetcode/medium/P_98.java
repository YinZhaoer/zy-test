package src.leetcode.medium;

import src.leetcode.structure.TreeNode;

/**
 * @author: ZhaoYin
 * @version: 2020/5/12
 * @description: 验证二叉搜索树  递归或者中序遍历 ，示例
 *          10
 *        8    15
 *      4   9     20
 *
 */
public class P_98 {

    public static void main(String[] args) {
        TreeNode root=new TreeNode(10);
        TreeNode left1=new TreeNode(8);
        TreeNode right1=new TreeNode(15);
        TreeNode left21=new TreeNode(4);
        TreeNode right22=new TreeNode(9);
        TreeNode right24=new TreeNode(20);
        root.setLeft(left1);
        root.setRight(right1);
        left1.setLeft(left21);
        left1.setRight(right22);
        right1.setRight(right24);
        isValidBST(root);

    }

    public static boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }

    public static boolean helper(TreeNode node,Integer lower,Integer upper){
        if(node==null){
            return true;
        }
        int val=node.getVal();
        if(lower!=null&&val<=lower) return false;
        if(upper!=null&&val>=upper) return false;
        if(!helper(node.getRight(),val,upper)) return false;
        if(!helper(node.getLeft(),lower,val)) return false;
        return true;

    }

}
