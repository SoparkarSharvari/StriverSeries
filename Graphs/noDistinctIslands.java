import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class noDistinctIslands {
    public static void main(String[] args){
        int[][] grid ={
            {1,1,0,1,1},
            {1,0,0,0,0},
            {0,0,0,0,1},
            {1,1,0,1,1}
        };
        int count = countDistinctIslands(grid);
        System.out.println("Number of distinct islands : " + count);
    }

    public static int countDistinctIslands(int[][] grid) {

        int n= grid.length;
        int m = grid[0].length;
        int[][] visitedgrid = new int[n][m];
        Set<String> set = new HashSet<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                visitedgrid[i][j] = 0;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && visitedgrid[i][j]==0){
                    List<String> shape = new ArrayList<>();
                    dfs(grid,i,j,visitedgrid,i,j,shape);
                    set.add(shape.toString());

                }
            }
        }
       
        return set.size();
    }
    public static void dfs(int[][] grid, int i , int j, int[][] visitedgrid,int base_x,int base_y , List<String> Shape){
        if(i<0 || j<0 || i> grid.length-1 || j> grid[0].length-1|| grid[i][j]==0 || visitedgrid[i][j]==1){
            return;
        }

        Shape.add((i-base_x) + "," + (j-base_y));
        visitedgrid[i][j] = 1;
        dfs(grid,i+1,j,visitedgrid,base_x,base_y,Shape);
        dfs(grid,i-1,j,visitedgrid,base_x,base_y,Shape);
        dfs(grid,i,j+1,visitedgrid,base_x,base_y,Shape);
        dfs(grid,i,j-1,visitedgrid,base_x,base_y,Shape);
    }
}
