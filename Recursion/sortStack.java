package Recursion;

import java.util.Stack;

public class sortStack {
	public static void main(String[] args) {
        sortStack sol = new sortStack();
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(1);
        stack.push(3);
        stack.push(2);

        sol.sortStack(stack);

        // Print the sorted stack
        System.out.print("Sorted stack (descending order): ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    public Stack<Integer> sortStack(Stack<Integer> stack){
        if()
    }
}
    

