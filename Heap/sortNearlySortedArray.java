package Heap;

public class sortNearlySortedArray {
    // Maximum elements that can be stored in heap
    static int capacity;  
    
    // Current no of elements in heap
    static int size;    
    // Array for storing the keys
    static int arr[];  
    
    sortNearlySortedArray (int cap){
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

    static void SortNearlySortedArray(int arr[], int k){
        // inserting k elements in the heap
        int ptr=0;
        for(int i=ptr ; i<k+1;i++){
            Insert(arr[i]);
            ptr++;
        }
        // now we will extract the minimum element from the heap
        
        int index = 0;
        int[] result = new int[arr.length];
        result[index] = ExtractMin();
        index++;
        // ptr is currently at k+1 th index and we have extracted the minimum element from the heap which is the first element of the result array 
        // so now we will insert the next element from the input array in the heap and then extract the minimum element from the heap and insert it in the result array and repeat this process until we have processed all the elements of the input array
        while(ptr < arr.length)
        {
            Insert(arr[ptr]);
            ptr++;
            result[index] = ExtractMin();
            index++;
        }
        // now we have processed all the elements of the input array but there are still some elements in the heap which we need to extract and insert in the result array
        while(size > 0){
            result[index] = ExtractMin();
            index++;
        }
        for(int i=0 ; i<result.length;i++){
            System.out.print(result[i] + " ");
        }
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
         int left = leftChild(i);
         int smallest = i;

         if(left < size && arr[left] < arr[smallest]){
             smallest = left;
         }
         if(right < size && arr[right] < arr[smallest]){
             smallest = right;
         }
         if(smallest != i){
             int temp = arr[smallest];
             arr[smallest] = arr[i];
             arr[i] = temp;
             heapify(smallest);
         }
        }
        public static int ExtractMin(){
             int min = arr[0];
             arr[0] = arr[size-1];
             size--;
             heapify(0);
             return min;
         }
         
        public static void main(String[] args){
        
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int k = 3 ; 
        sortNearlySortedArray h = new sortNearlySortedArray(k+1);
        SortNearlySortedArray(arr, k);

    }
}
