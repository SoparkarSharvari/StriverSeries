
// LIFO 
public class stackWithArrays {
    public static void main(String[] args){
        stack s = new stack();
        s.push(6);
        s.push(3);
        s.push(7);
        System.out.println("Top of the stack before deleting any element " + s.top());
        System.out.println("Size of the stack before deleting any element " + s.size());
        System.out.println("The element deleted is " + s.pop());
        System.out.println("Size of the stack after deleting an element " + s.size());
        System.out.println("Top of the stack " + s.top());
    }
}  
    class stack{
        int size = 100;
        int top = 0;
        int arr[]=new int[size];

        void push(int value){
            arr[top] = value;
            top++;
        }
        int pop(){
            top--;
            int value = arr[top];
            return value;
        }
        int top(){
            int value = arr[top-1];
            return value;
        }
        int size(){

            return top  ;
        }
    }

