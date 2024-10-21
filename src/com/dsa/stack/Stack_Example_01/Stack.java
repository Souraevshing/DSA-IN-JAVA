package com.dsa.stack.Stack_Example_01;

public class Stack {

    private int[] arr;
    private int size;
    private int tos;

    public Stack(int size) {
        arr = new int[size];
        this.size = size;
        tos = -1;
    }

    public void push(int a) {
        if (tos == size-1) {
            System.out.println("Stack overflow");
            return;
        }
        tos++;
        arr[tos] = a;
    }

    public int pop() {
        if (tos == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int a;
        a = arr[tos];
        tos--;
        return a;
    }

    public int peek() {
        if (tos == -1) {
            System.out.println("Stack underflow");
            return -1;
        }
        int a;
        a = arr[tos];
        return a;
    }
}
