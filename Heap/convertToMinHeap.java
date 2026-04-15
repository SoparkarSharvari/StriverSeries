package Heap;
import static Heap.basicHeapFunctions.*;
public class convertToMinHeap {
    public static void main(String[] args) {
     basicHeapFunctions h = new basicHeapFunctions(9);
        Insert(1);
        Insert(4);
        Insert(2);
        Insert(5);
        Insert(7);
        Insert(3);
        Insert(8);
        

        System.out.print("Heap elements: ");
        print();
        convertToMinHeap(0);
        print();
    }

    static void Insert(int element){
        if(size == capacity){
            System.out.println("Heap is full");
        }
        arr[size] = element;
        size++;  
    }

    public static void convertToMinHeap(int i){
        int n = size;
        int left = leftChild(i);
        int right = rightChild(i);
        int smallest = i;

        if(left < n && arr[left]< arr[smallest]){
            smallest = left;
        }
        if(right < n && arr[right] < arr[smallest]){
            smallest = right;
        }
        if(smallest !=i){
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
            convertToMinHeap(smallest);
        }    
    }

}
