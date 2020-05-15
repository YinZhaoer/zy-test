package src.leetcode.easy;

/**
 * @Author zhaoyin@crop.netease.com
 * @Date 2020/5/3 11:33
 * @Version 1.0
 * @Description  最大连续子串  DP 核心公式 f(i)=max{f(i-1)+a(i),a(i)}  算出所有位置子串的最大值然后取最大即可
 */


public class P_53 {

    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        if (nums.length <= 1) {
            return nums[0];
        }
        int max = nums[0];
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum=getBigger(sum+nums[i],nums[i]);
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

    public static int getBigger(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

}
