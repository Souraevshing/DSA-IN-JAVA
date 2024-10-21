package com.dsa.stack.Stack_Example_02;

public class UseStack {

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        int a = 100;
        try {
            for (int i = 1; i <= 5; i++) {
                stack.push(a);
                a += 10;
            }
        } catch (StackException exception) {
            System.out.printf("Exception: %s\n", exception.getMessage());
        }

        try {
            System.out.printf("Top element: %d\n", stack.peek());
            for (int i = 1; i <= 5; i++) {
                a = stack.pop();
                System.out.printf("Popped: %d\n", a);
            }
        } catch (StackException exception) {
            System.out.printf("Exception: %s\n", exception.getMessage());
        }
    }

}
