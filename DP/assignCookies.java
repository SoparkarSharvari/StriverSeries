package DP;
import java.util.*;

public class assignCookies {
    public static void main(String[] args){
        int[] Students = {1,2,3};
        int[] Cookies = {0,3,2};
        Arrays.sort(Students);
        Arrays.sort(Cookies);
        int[][] dp = new int[Students.length+1][Cookies.length+1];
        for(int i=0;i<= Students.length;i++){
            for(int j=0;j<= Cookies.length;j++){
                dp[i][j] = 0;
            }
        }
        int count = findContentChildren(Students,Cookies,dp,0,0);
        System.out.println("Maximum number of content children : " + count);
    } 
    public static int findContentChildren(int[] students,int[] cookies, int[][] dp,int i, int j){
        int count = 0;
        //memoization
        if (i>= students.length || j>= cookies.length){
            return 0;
        }
        if(dp[i][j]!=0){
            return dp[i][j];    
        }

        if(students[i] <= cookies[j]){
            //assign cookie to student
            count = 1+ findContentChildren(students,cookies,dp,i+1,j+1);
        }
        else{
            //skip cookie
            count = findContentChildren(students,cookies,dp,i,j+1);
        }
        // skip student
        int c = findContentChildren(students,cookies,dp,i+1,j) ;

        count=Math.max(count,c);
        dp[i][j] = count;
        
        //tabulation
        return count;

    }

}

