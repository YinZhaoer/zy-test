package src.leetcode.easy;

/**
 * @Author zhaoyin@crop.netease.com
 * @Date 2020/5/4 10:37
 * @Version 1.0
 * @Description 单词搜索  回溯  DFS  方向状态量
 */
public class P_79 {

    public static void main(String[] args) {

        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(exist(board, "NIMA"));
    }

    public static boolean exist(char[][] board, String word) {
        if(board.length==0){
            return false;
        }
        int [][] direction={{0,1},{0,-1},{1,0},{-1,0}};
        String[] chars = word.split("");
        int arrayCount=board.length;
        int arrayLength=board[0].length;
        int[][] state = new int[arrayCount][arrayLength];
        for(int i=0;i<arrayCount;i++){
            for(int j=0;j<arrayLength;j++){
                if(dfs(i,j,0)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(int i,int j,int start){


    }


}
