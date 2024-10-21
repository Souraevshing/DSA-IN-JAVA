package com.dsa.stack.Stack_Example_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Stack implementation using Arrays
 */
public class UseStack {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Stack stack = new Stack(5);
        System.out.println("Enter no to insert into stack:");
        int x = Integer.parseInt(bufferedReader.readLine());
        for(int i = 1; i <= 6; i++) {
            stack.push(x);
            System.out.printf("Pushed: %d\n", x);
            x += 10;
        }

        System.out.printf("Top element: %d\n", stack.peek());
    }

}
