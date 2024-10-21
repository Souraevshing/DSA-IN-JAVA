package com.dsa.stack.Stack_Example_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Stack implementation using Arrays
 */
public class UseStack {

    public static void main(String[] args) throws IOException {
        String choice;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("Do you want to continue(Y/N)?");
            choice = bufferedReader.readLine().trim().toUpperCase();
            if (choice.equalsIgnoreCase("N")) {
                return;
            }

            if (!choice.equalsIgnoreCase("Y") && !choice.equalsIgnoreCase("N")) {
                System.out.println("Invalid input");
            }
        }

        while(!choice.equalsIgnoreCase("Y"));

        Stack stack = new Stack(5);

        try {
            System.out.println("Enter elements:");
            for (int i = 1; i <= 5; i++) {
                stack.push(Integer.parseInt(bufferedReader.readLine().trim()));
            }
        } catch (StackException exception) {
            System.out.printf("Exception: %s\n", exception.getMessage());
        } catch(NumberFormatException exception) {
            System.out.println("Invalid input");
        }

        try {
            System.out.printf("Top element: %d\n", stack.peek());
            for (int i = 1; i <= 5; i++) {
                int a = stack.pop();
                System.out.printf("Popped: %d\n", a);
            }
        } catch (StackException exception) {
            System.out.printf("Exception: %s\n", exception.getMessage());
        }
    }

}