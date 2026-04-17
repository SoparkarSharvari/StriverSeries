import java.util.Queue;
import java.util.LinkedList;

public class noOfEnclaves {
    public static void main(String[] args){
        char[][] grid = {
            {'0','0','0','0'},
            {'1','0','1','0'},
            {'0','1','1','0'},
            {'0','0','0','0'},
            {'0','0','1','0'}
        };

        int count = countEnclaves(grid);
        System.out.println("Number of enclaves : " + count);
    }

    public static int countEnclaves(char[][] grid) {
        // create a visited array to keep track of visited cells
        int count = 0;
        Queue<int[]> queue = new LinkedList<>();
        char[][] visited = new char[grid.length][grid[0].length];
        for(int i=0;i< grid.length;i++){
            for(int j=0 ;j<grid[0].length;j++){
                visited[i][j] = '0';
            }
        }

        for(int i=0;i< grid.length;i++){
            for(int j=0 ;j<grid[0].length;j++){
                if(i==0 || j==0 || i == grid.length-1 || j == grid[0].length-1){
                    if(grid[i][j]=='1' && visited[i][j]=='0'){
                        visited[i][j] = '1';
                        queue.add(new int[]{i,j});
                    }
                }
            }
        }
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];
            visitNighbours(grid,visited,x+1,y,queue);
            visitNighbours(grid,visited,x-1,y,queue);
            visitNighbours(grid,visited,x,y+1,queue);
            visitNighbours(grid,visited,x,y-1,queue);
        }

        for (int i=0;i< grid.length;i++){
            for(int j=0 ;j<grid[0].length;j++){
                if(grid[i][j]=='1' && visited[i][j]=='0'){
                    count=count+1;
                }
            }
        }
        return count;
    }

    public static void visitNighbours(char[][] grid, char[][] visited , int i , int j, Queue<int[]> queue){
        if(i<0 || j<0 || i > grid.length-1 || j > grid[0].length-1 || grid[i][j]=='0' || visited[i][j]=='1'){
            return;
        }
        visited[i][j] = '1';
        queue.add(new int[]{i,j});

    }
}