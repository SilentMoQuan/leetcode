package dynamic;

/**
 * describe
 * <br />
 *
 * @author :<b> wangYuanHong </b><br />
 * @date :<b> 2022/12/23 14:15 </b><br />
 */
public class No63 {

    public static void main(String[] args) {
        new No63().uniquePathsWithObstacles(new int[][]{{0,1},{1,0}});
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(obstacleGrid[m - 1][n - 1] == 1){
            return 0;
        }

        for (int i = 0; i < m; i++) {
            if(obstacleGrid[i][0] == 1){
                break;
            }
            obstacleGrid[i][0] = -1;
        }

        for (int i = 0; i < n; i++) {
            if(obstacleGrid[0][i] == 1){
                break;
            }
            obstacleGrid[0][i] = -1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1){
                    continue;
                }

                if (obstacleGrid[i - 1][j] < 1 && obstacleGrid[i][j - 1] < 1){
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
                }else if(obstacleGrid[i - 1][j] == 1 && obstacleGrid[i][j - 1] == 1){
                    obstacleGrid[i][j] = 0;
                }else if(obstacleGrid[i - 1][j] == 1){
                    obstacleGrid[i][j] = obstacleGrid[i][j - 1];
                }else if (obstacleGrid[i][j - 1] == 1){
                    obstacleGrid[i][j] = obstacleGrid[i - 1][j];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(obstacleGrid[i][j]+ "    ");
            }
            System.out.println();
        }

        return obstacleGrid[m - 1][n - 1] * -1;
    }

}
