package Heap;
import static Heap.basicHeapFunctions.*;

public class checkIfMinHeap {
    public static void main(String[] args){
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
        System.out.println("Is the heap a min heap? " + isMinHeap());
    }

    static void Insert(int element){
        if(size == capacity){
            System.out.println("Heap is full");
        }
        arr[size] = element;
        size++;  
    }
    static boolean isMinHeap(){
        for(int i=0 ; i< size;i++){
            int left =leftChild(i);
            int right = rightChild(i);
        if(left < size && arr[i] > arr[left]){
                return false;       
        }
        if(right < size && arr[i] > arr[right]){
                return false;       
        }
    }
    return true;
}
}
