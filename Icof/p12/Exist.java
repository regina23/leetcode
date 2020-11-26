package p12;

public class Exist {
    public static boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(dfs(board, words, i, j, 0))
                    return true;
            }
        }
        return false;
    }
    static boolean dfs(char[][] board, char[] words, int i, int j, int index) {
        if(i >= board.length || i < 0 || j>= board[0].length || j < 0 || board[i][j] != words[index]) {
            return false;
        }
        if(index == words.length - 1) {
            return true;
        }
        board[i][j] = '\0';
        boolean res = dfs(board, words, i + 1, j, index + 1) || dfs(board, words, i - 1, j, index + 1) ||
                      dfs(board, words, i, j + 1, index + 1) || dfs(board, words, i, j - 1, index + 1);
        board[i][j] = words[index];
        return res;
    }

    public static void main(String[] args) {
        char[][] board1 = {{'A', 'B', 'C','E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word1 = "ABCCED";
        boolean res1 =  exist(board1, word1);

        char[][] board2 = {{'a', 'b'}, {'c', 'd'}};
        String word2 = "abcd";
        boolean res2 = exist(board2, word2);

        System.out.println(res1);
        System.out.println(res2);

    }
}
