package src.leetcode.easy;

import java.util.Stack;

/**
 * @Author zhaoyin@corp.netease.com
 * @Date 2020/5/3 14:38
 * @Version 1.0
 * @Description 有效的括号  堆栈思想
 */
public class P_20 {

    public static void main(String[] args) {
        String s = "[";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        if(s.equals("")){
            return true;
        }
        String[] strs = s.split("");
        Stack<String> stringStack = new Stack<String>();
        for (String str : strs) {
            if (str.equals("{") || str.equals("[") || str.equals("(")) {
                stringStack.push(str);
            } else {
                if (stringStack.empty()) {
                    return false;
                } else {
                    if (str.equals("]")) {
                        if (!stringStack.pop().equals("[")) {
                            return false;
                        }
                    }
                    if (str.equals(")")) {
                        if (!stringStack.pop().equals("(")) {
                            return false;
                        }
                    }
                    if (str.equals("}")) {
                        if (!stringStack.pop().equals("{")) {
                            return false;
                        }
                    }
                }
            }
        }
        if(stringStack.empty()){
            return true;
        }
        return false;
    }

}
