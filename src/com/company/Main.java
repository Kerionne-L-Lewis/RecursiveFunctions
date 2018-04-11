package com.company;



public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello  Recursive Function!\n");

        int factorial=calculateFactorial(10);
        System.out.println( "Whats the factorial of n? " + factorial);

        int fibonacci = calculateFibonacci(6);
        System.out.println("What is the fibonacci sqeunce of n?" + fibonacci);

        recursive_Output("Dr.Edwards", 2);
    }

    private static void recursive_Output(String word, int i) {
            if(i == 0)
                return;
            else
                System.out.println("" + i*recursive_Output(word, i));
            return;


    }

    private static int calculateFibonacci(int i) {
     if(i<=1)
         return i;
     return calculateFibonacci(i-1) + calculateFibonacci(i-2);
    }


    public static int calculateFactorial(int n) {
        if (n<=1)
        return 1;
        return n * calculateFactorial(n-1);

    }



}
