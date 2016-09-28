public class MinimumPathSum_64{
    public int minPathSum(int[][] grid){
        int row = grid.length;
        int clo = grid[0].length;
        if(row == 0 || clo == 0) return 0;

        int[][] res = new int[row][clo];
        res[0][0] = grid[0][0];
        
        for(int i = 1; i < clo; i++)
            res[0][i] = grid[0][i] + res[0][i - 1];
        for(int i = 1; i < row; i++)
            res[i][0] = grid[i][0] + res[i - 1][0];
        for(int i = 1; i < row; i++){
            for(int j = 1; j < clo; j++){
                res[i][j] = grid[i][j] + Math.min(res[i - 1][j], res[i][j - 1]);
            }
        }

        return res[row - 1][clo - 1];
    }

    public static void main(String args[]){
        System.out.println(new MinimumPathSum_64().minPathSum(new int[][]{{1, 3, 1}, 
                                                                          {1, 5, 1},
                                                                          {4, 2, 1}}));
    }
}
