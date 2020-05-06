package src.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author: ZhaoYin
 * @version: 2020/5/6
 * @description: 合并区间   第一种排序逻辑法 (需要先排序)   第二种使用额外空间进行解析
 * @ see https://leetcode-cn.com/problems/merge-intervals/solution/na-kong-jian-huan-shi-jian-er-qie-wo-mei-pai-xu-_-/
 */
public class P_56 {

    public static void main(String[] args) {
        int[][] intervals = new int[][]{{2, 6}, {1, 3}, {8, 10}, {15, 18}};
        System.out.println(merge(intervals));
    }

    public static int[][] merge(int[][] intervals) {
        List<int[]> res = new ArrayList<int[]>();
        Arrays.sort(intervals, Comparator.comparingInt(v -> v[0]));
        res.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {

        }
        return res.toArray(intervals);


    }


}
