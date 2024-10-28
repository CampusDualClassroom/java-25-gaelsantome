package com.campusdual.classroom;

import java.util.Queue;
import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {

        Stack<String> stack1 = new Stack<>();

        stack1.push("Smith");
        stack1.push("Montessori");
        stack1.push("Peralta");
        stack1.push("House");

        return stack1;
    }

    public static void printAndEmptyStack(Stack<String> stack) {

        while (!stack.isEmpty()){
            String peekedItem = stack.peek();
            System.out.println("Peeked instrument: " + peekedItem);
            String removedItem = stack.pop();
            System.out.println("Removed instrument: " + removedItem);
        }


    }

    public static void main(String[] args) {

        Stack<String> myStack = createStack();

        System.out.println("Imprimiendo y vaciando la cola:");
        printAndEmptyStack(myStack);

    }



}
