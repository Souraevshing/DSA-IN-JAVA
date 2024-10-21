package com.dsa.stack.Stack_Example_03;

public class Stack {

    private int[] arr;
    private int size;
    private int tos;

    public Stack(int size) {
        this.size = size;
        arr = new int[size];
        tos = -1;
    }

    public void push(int a) {
        if (tos == size-1) {
            throw new StackException("Stack overflow");
        }
        tos++;
        arr[tos] = a;
        return;
    }

    public int pop() {
        if (tos == -1) {
            throw new StackException("Stack underflow");
        }
        int a;
        a = arr[tos];
        tos--;
        return a;
    }

    public int peek() {
        if (tos == -1) {
            throw new StackException("Stack underflow");
        }
        int a;
        a = arr[tos];
        return a;
    }

}