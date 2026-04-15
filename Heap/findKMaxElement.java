package Heap;
import static Heap.basicHeapFunctions.*;
public class findKMaxElement {
    public static void main (String[] args){
        basicHeapFunctions h = new basicHeapFunctions(9);
        Insert(1);
        Insert(2);
        Insert(3);
        Insert(4);
        Insert(5);
        Insert(6);
        Insert(7);
        int k = 7;
        
    for(int i = size/2 - 1; i >= 0; i--){
        heapify(i);
    }

    System.out.println(findKMax(k));
    }
    static void heapify(int i){
        // Implementation for heapify
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;

        if(left< size && arr[left]>arr[largest]){largest = left;}
        if(right< size && arr[right]>arr[largest]){largest = right;}

        if(largest != i){
            int temp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = temp;
            heapify(largest);
        }
    }
    static int findKMax(int k){
        for (int i=0 ; i<k-1;i++){
            extractMax();
        }
        return extractMax();
    }

    static int extractMax(){
        int max=arr[0];
        arr[0] = arr[size-1];
        size--;
        heapify(0);
        return max;
    }
}
