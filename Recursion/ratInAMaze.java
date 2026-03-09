package Recursion;

import java.util.ArrayList;

public class ratInAMaze {
    public static void main(String[] args) {
        int[][] maze ={
            {1,0,0,0},
            {1,1,0,1},
            {1,1,0,0},
            {0,1,1,1}
        };
        int n= maze.length;
        System.out.println(findPath(maze,n));

    }
    public static ArrayList<String> findPath(int[][] maze, int n){
        ArrayList<String> result = new ArrayList<>();
        findPathHelper(0,0,maze,"",result);
        return result;
    }
    public static void findPathHelper(int row, int col,int[][] maze,String str, ArrayList<String> result){
        if(row < 0 || col<0 || row>=maze.length || col>= maze[0].length || maze[row][col]==0){
            return;
        }
        if(row == maze.length-1 && col == maze[0].length-1){
            result.add(str);
            return;
        }
        maze[row][col] = 0;
        findPathHelper(row,col-1,maze,str+"L",result);
        findPathHelper(row,col+1,maze,str+"R",result);
        findPathHelper(row-1,col,maze,str+"U",result);
        findPathHelper(row+1,col,maze,str+"D",result);
        maze[row][col] = 1;
    }
}
