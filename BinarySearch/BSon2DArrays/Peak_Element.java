package BinarySearch.BSon2DArrays;

public class Peak_Element {
    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 15},
            {21, 30, 14},
            {7, 16, 32}
        };
        int[] peak = findPeakElement(matrix);
        System.out.println("Peak Element: " + peak[0] + ", " + peak[1]);
    }
    public static int[] findPeakElement(int[][] matrix){
        int rows=matrix.length; // dry run // rows=3
        int cols=matrix[0].length; // cols=3
        int low=0;
        int hight=cols-1; // hight=2
        while(low<=hight){
            int mid=low+(hight-low)/2; // mid=1
            int maxRow= getMaxRow(matrix, mid); // maxRow=1
            
            int left = (mid - 1 >= 0) ? matrix[maxRow][mid - 1] : -1;
            int right = (mid + 1 < cols) ? matrix[maxRow][mid + 1] : -1;

            if (matrix[maxRow][mid] > left && matrix[maxRow][mid] > right) {
                return new int[]{maxRow, mid};
            }
            
            else if(matrix[maxRow][mid]<matrix[maxRow][mid-1] && mid-1>=0){ // 
                    hight=mid-1;
            }
            else if(matrix[maxRow][mid]<matrix[maxRow][mid+1] && mid+1<cols){
                    low=mid+1;
        }   
    }
    return new int[]{-1,-1};
}
    public static int getMaxRow(int[][] matrix, int col){
        int maxRowindex=0;
        for(int i=1;i<matrix.length;i++){
            if(matrix[i][col]> matrix[maxRowindex][col]){
                maxRowindex=i;
            }
           
    }
     return maxRowindex;
}
}

