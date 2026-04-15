
public class surroundedRegion {
    public static void main(String[] args) {
        char board[][] = {{'X', 'X', 'X', 'O'},
                        {'O', 'O', 'O', 'X'},
                        {'X', 'O', 'O', 'X'},
                        {'X', 'X', 'X', 'X'}};

        System.out.println("The original board is : ");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }   

        System.out.println();

        char ans[][] = solve(board);

        System.out.println("The modified board is : ");
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }    
    public static char[][] solve(char[][] board){
        int n=board.length;
        int m = board[0].length;
        System.out.println("n : " + n + " m : " + m);
        char ans[][] = new char[n][m];
        for(int i=0 ;i< n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]=='O' && (i==0 || j==0 || i==n-1 || j==m-1)){
                    System.out.println("dfs called for " + i + " " + j);
                    dfs(board,i,j,ans);
                }
            }
        }
        for(int i=0 ;i< n;i++){
            for(int j=0;j<m;j++){
                if(ans[i][j]!='A'){
                    ans[i][j]='X';
                }
                else{
                    ans[i][j]='O';
                }
            }
        }
        return ans;
    }
    public static void dfs(char[][] board, int i, int j,char ans[][]){
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || ans[i][j]=='A' || board[i][j]=='X'){
            return;
        }
        ans[i][j]='A';
        dfs(board,i+1,j,ans);
        dfs(board,i-1,j,ans);
        dfs(board,i,j+1,ans);
        dfs(board,i,j-1,ans);
    }
}
