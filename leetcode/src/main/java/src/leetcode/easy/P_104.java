package src.leetcode.easy;

import src.leetcode.structure.TreeNode;

/**
 * @author: ZhaoYin@corp.netease.com
 * @version: 2020/5/21
 * @description: 二叉树最大深度 是P_559的基础
 */
public class P_104 {
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            //终止条件
            return 0;
        } else {
            //递
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            //归
            return Math.max(left, right) + 1;
        }
    }

}
