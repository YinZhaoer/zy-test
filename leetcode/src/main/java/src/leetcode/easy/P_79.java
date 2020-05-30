package src.leetcode.easy;

/**
 * @Author zhaoyin@crop.netease.com
 * @Date 2020/5/4 10:37
 * @Version 1.0
 * @Description 单词搜索  回溯  DFS  方向状态量
 */
public class P_79 {

    //todo zy uncommit
    private static boolean[][] marked;

    private static char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};

    private static int[][] direction = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private static String word = "ABCB";

    private static int length;

    private static int height;


    public static void main(String[] args) {
        System.out.println(exist(board, word));
    }

    public static boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        }
        int [][] direction={{0,1},{0,-1},{1,0},{-1,0}};
        String[] chars = word.split("");
        int arrayCount=board.length;
        int arrayLength=board[0].length;
        int[][] state = new int[arrayCount][arrayLength];
        height = board.length;
        length = board[0].length;
        marked=new boolean[height][length];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                if (dfs(i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(int i, int j, int start) {
        //start标志的是word下标
        if (start == word.length() - 1) {
            return board[i][j] == word.charAt(start);
        }
        if (board[i][j] == word.charAt(start)) {
            marked[i][j] = true;
            for (int k = 0; k < 4; k++) {
                int newX = i + direction[k][0];
                int newY = j + direction[k][1];
                //核心递归
                if (inArea(newX, newY)&&!marked[newX][newY]){
                    if(dfs(newX,newY,start+1)){
                        return true;
                    }
                }
            }
            //四个方向都失败则回退，重置状态
            marked[i][j]=false;
        }
        return false;


    }


    private static boolean inArea(int x, int y) {
        return x >= 0 && x < length && y >= 0 && y < height;
    }


}
