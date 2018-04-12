package com.company;


import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;

import static com.company.Main.recursive_Output;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nHello  Recursive Function!\n");

        int factorial = calculateFactorial(10);
        System.out.println("Whats the factorial of n? " + factorial);

        int fibonacci = calculateFibonacci(2);
        System.out.println("What " + "is the fibonacci sequence of n? " + fibonacci);

        String output = recursive_Output("Dr.Edwards", 3);
        System.out.println(output);

       /* ArrayList<String>alphabet= new ArrayList<>();
        alphabet.add("A");
        alphabet.add("B");
        alphabet.add("C");
        int length= length_ArrayList(alphabet);
        System.out.println("The length is " + length);*/



        //TODO (4) Write a recursive function to calculate the length of an ArrayList without using ArrayList.size().  For example, [a,b,c] has length 3.

        //(5) Write a recursive function to calculate sum(a,b).  sum(a,b) is the sum of a and b.  For example, sum(2,3) is 5.
        //
        //(6) Write a recursive function to calculate exponentiation(base, power).  For example, exponentiation(2,3) is 8.
        //
        //(7) Write a recursive function to count the number of occurrences of character [C] in a String.  You must use String.indexOf().  For example, "abbacca" has 3 a's.
    }

  /*  private static int length_ArrayList(ArrayList<String> abc) {
        if (abc.isEmpty())
            return 0;
        String temp =
        return (length_ArrayList(abc)-1) + 1;
    }
*/
    public static String recursive_Output(String word, int i) {
        if (i == 0)
            return "";
        if (i == 1)
            return word;
        return (recursive_Output(word, i - 1) + word);

    }

    private static int calculateFibonacci(int i) {
        if (i == 0)
            return 0;
        if (i==1)
            return i;
        return calculateFibonacci(i - 1) + calculateFibonacci(i - 2);
    }


    public static int calculateFactorial(int n) {
        if (n <= 1)
            return 1;
        return n * calculateFactorial(n - 1);

    }


}
