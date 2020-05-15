package src.leetcode.easy;

import sun.swing.StringUIClientPropertyKey;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @Author zhaoyin@corp.netease.com
 * @Date 2020/5/3 12:11
 * @Version 1.0
 * @Description 最长公共前缀
 */
public class P_37 {

    public static void main(String[] args) {
        String[] strs = {"aa", "aa"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        LinkedHashSet<String> prefixSet = new LinkedHashSet<String>();
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() < i+1) {
                    return strs[0].substring(0,i);
                } else {
                    prefixSet.add(strs[j].charAt(i)+String.valueOf(i));
                    if(prefixSet.size()!=i+1){
                        return strs[0].substring(0,i);
                    }
                }
            }
        }
        if(prefixSet.size()!=0){
            return strs[0].substring(0,prefixSet.size());
        }
        return "";
    }


}
