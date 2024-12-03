package main.java.by.rublevskaya.task1;

import java.util.Scanner;
/*
Create a generalized functional interface.
Write a class with one method.
In this method, implement the logic:
- if the number 1 is entered into the console, then: use the interface with a string type and pass the logic of
reversing the string (outputting the string in reverse order) to the interface method.
- if the number 2 is entered into the console, then: use the interface with an integer type and pass the logic
of finding the factorial of the number to the interface method.
 */
public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (1 for string reversal, 2 for factorial):");
        int choice = scanner.nextInt();
        if(choice == 1) {
            MyFunctionalInterf<String> reverse = s -> new StringBuilder(s).reverse().toString();
            scanner.nextLine();
            System.out.println("Enter the line: ");
            String input = scanner.nextLine();
            System.out.println("Reverse: " + reverse.test(input));
        } else if (choice == 2) {
            MyFunctionalInterf<Integer> factorial = n -> {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result *= i;
                }
                return result;
            };
            System.out.println("Enter the number: ");
            int number = scanner.nextInt();
            System.out.println("Factorial: " + factorial.test(number));
        } else {
            System.out.printf("Invalid input");
        }
        scanner.close();
    }
}
