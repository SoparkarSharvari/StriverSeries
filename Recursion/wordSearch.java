package Recursion;

public class wordSearch {
    public static void main(String[] args) {
        char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
    public static boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(i)){
                    if(existHelper(board, word, i, j, 0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean existHelper(char[][] board, String word,int i, int j,int pos){
        if(pos == word.length()){
            return true;
        }
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] != word.charAt(pos)){
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';
        boolean found = existHelper(board, word, i+1, j, pos+1) ||
                        existHelper(board, word, i-1, j, pos+1) ||
                        existHelper(board, word, i, j+1, pos+1) ||
                        existHelper(board, word, i, j-1, pos+1);
        board[i][j] = temp;
        if(found){
            return true;
        }
        return false;
    }
}
