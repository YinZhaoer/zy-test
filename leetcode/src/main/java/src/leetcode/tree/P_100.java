package src.leetcode.tree;

import src.leetcode.structure.TreeNode;

/**
 * @Author zhaoyin@corp.netease.com
 * @Date 2020/8/2 15:03
 * @Version 1.0
 * @Description 相同的树判断
 */
public class P_100 {
    public static void main(String[] args) {

    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        //子树操作
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        if(p.val!=q.val) return false;
        //循环子树
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
