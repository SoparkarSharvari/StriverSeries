package Heap;

public class basicHeapFunctions {
    // Maximum elements that can be stored in heap
    static int capacity;  
    
    // Current no of elements in heap
    static int size;    
    // Array for storing the keys
    static int arr[];  
    
    basicHeapFunctions (int cap){
        capacity = cap;
        size = 0;
        arr = new int[capacity];
    }
    static int parent(int child){
        return (child-1)/2;
    }
    static int leftChild(int parent)
    {
        return 2*parent + 1;
    }
    static int rightChild(int parent)
    {
        return 2*parent + 2;
    }
    static void Insert(int element){
        if(size == capacity){
            System.out.println("Heap is full");
        }
        arr[size] = element;
        int k= size;
        size++;
        //convert to min heap
        while(size !=0 && arr[parent(k)] > arr[k]){
            int temp = arr[parent(k)];
            arr[parent(k)] = arr[k];
            arr[k] = temp;
            k = parent(k);
        }
        
    }
    public static void heapify(int i){
        int right= rightChild(i);
        int left= leftChild(i);

        int smallest = i;
        if(arr[left] < arr[smallest] && left < size){
            smallest = left;
        }
        if(arr[right] < arr[smallest] && right < size){
            smallest = right;
        }
        // if smallest is not equal to i then it means that the heap property is voilated and we need to fix it by swapping the elements and then calling heapify on the smallest index
        if(smallest != i){
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]=temp;
            heapify(smallest);
        }

    }
    //will give min of the minheap
    static int getMin() {
        return arr[0];
    }

    static void print() {
        for (int i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }

    static int ExtractMin(){
        int MininumfromMinHeap = arr[0];
        arr[0] = arr[size-1];
        size--;
        heapify(0);
        return MininumfromMinHeap;
    }

    //Given an index and a value, we need to update the value at the index with the given value. 
    // We assume that the given value is less than the existing value at that index.

    static void Decreasekey(int i ,int value){
        arr[i] = value;
        while(i !=0 && arr[parent(i)] > arr[i]){
            int temp = arr[parent(i)];
            arr[parent(i)] = arr[i];
            arr[i]= temp;
            i = parent(i);
        }
    }
    static void Delete(int i){
        Decreasekey(i, Integer.MIN_VALUE);
        ExtractMin();
    }

    public static void main(String[] args) {
        basicHeapFunctions h = new basicHeapFunctions(9);
            Insert(4);
            Insert(1);
            Insert(2);
            Insert(6);
            Insert(7);
            Insert(3);
            Insert(8);
            Insert(5);

    print();
    System.out.println("Min value is " + getMin());

    Insert(-1);
    print();
    System.out.println("Min value is " + getMin());

    Decreasekey(3, -2);
    print();
    System.out.println("Min value is " + getMin());

    ExtractMin();
    System.out.println("Min value is " + getMin());

    Delete(0);
    System.out.println("Min value is " + getMin());
    }
}


    

