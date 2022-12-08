package backtracking;

/**
 * describe
 * <p>
 * 2022/12/8 22:35
 *
 * @author MoQuan
 */
public class No37 {

    public void solveSudoku(char[][] board) {

        backtracking(board);

    }

    private boolean backtracking(char[][] board) {

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {

                if (board[r][c] == '.') {
                    for (char i = '1'; i <= '9'; i++) {


                        if (isValid(board, r, c, i)) {

                            board[r][c] = i;
                            if (backtracking(board)) {
                                return true;
                            }
                            board[r][c] = '.';

                        }

                    }
                    return false;
                }
            }
        }

        return true;
    }


    private boolean isValid(char[][] board, int r, int c, char num) {

        int row = (r / 3) * 3;
        int column = (c / 3) * 3;

        for (int i = 0; i < 9; i++) {

            if (board[r][i] == num || board[i][c] == num || board[row][column] == num) {
                return false;
            }

            if (i % 3 == 2) {
                row += 1;
                column = (c / 3) * 3;
            } else {
                column++;
            }

        }

        return true;
    }


}
