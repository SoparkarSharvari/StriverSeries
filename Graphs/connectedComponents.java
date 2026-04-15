
import java.util.Scanner;

public class connectedComponents{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of vertices :");
        int v = sc.nextInt();
        System.out.println("Enter the number of edges :");
        int e = sc.nextInt();
        int[][] graph = new int[v][v];
        System.out.println("Enter the edges :");
        for(int i=0; i< e;i++){
            System.out.println("Enter the vertices of edge " + (i+1) + " :");
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x][y] = 1;
            graph[y][x] = 1;
        }
        sc.close();
        int count = countConnectedComponents(graph);
        System.out.println("Number of connected components : " + count);
    }
    public static void visitNighbours(int[][] graph , int vertex, int[] visited){
        visited[vertex] =1;
        for(int i=0;i< graph.length;i++){
            if(visited[i]==0 && graph[vertex][i]==1){
                visitNighbours(graph,i,visited);
            }
        }
    }
    public static int countConnectedComponents(int[][] graph){
        int count=0;
        int[] visited= new int[graph.length];
        for(int i=0;i< graph.length;i++){
            if(visited[i]==0){
                count++;
                visitNighbours(graph,i,visited);
            }
    } return count;
}
}