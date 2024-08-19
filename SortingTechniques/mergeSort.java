package SortingTechniques;

import java.util.Scanner;

class mergeSort {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array : ");
        int N = sc.nextInt();
        int[] array = new int[N];

        for(int i=0 ; i < N ; i++){
            array[i]=sc.nextInt(); 
        }
        System.out.println();
        mergeSort(array, 0, N - 1);
        System.out.println("After sorting array: ");
        for (int i = 0; i < N; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
    void merge(int arr[], int l, int m, int r)
    {
        
    }
    void mergeSort(int arr[], int l, int r)
    {
        if(l >= r ){
            return;
        }
        int m = (l+r )/2;
        mergeSort(arr, l, m);
        mergeSort(arr, m+1, r);
        merge(arr, l, m, r);
    }

}