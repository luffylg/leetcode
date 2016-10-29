/**
 * Created by hp on 2016/10/29.
 */
public class ValidSudoku_36 {
    public boolean isValidSudoku(char[][] board) {
        int[][] intsi = new int[9][9];
        int[][] intsj = new int[9][9];
        int[][] intsij = new int[9][9];
        for (int i = 0; i <9 ; i++) {
            for (int j = 0; j < 9; j++) {
                int ct=board[i][j]-'1';
                if (board[i][j]!='.') {
                    if (intsi[i][ct]==1||intsj[j][ct]==1||intsij[(i/3)*3+j/3][ct]==1) return false;
                    intsi[i][ct]++;
                    intsj[j][ct]++;
                    intsij[(i/3)*3+j/3][ct]++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] chars = {".87654321".toCharArray(), "2........".toCharArray(), "3........".toCharArray(), "4........".toCharArray(), "5........".toCharArray(), "6........".toCharArray(), "7........".toCharArray(), "8........".toCharArray(), "9........".toCharArray()};
        System.out.println(new ValidSudoku_36().isValidSudoku(chars));
    }
}
