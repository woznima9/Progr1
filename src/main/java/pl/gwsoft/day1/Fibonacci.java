package pl.gwsoft.day1;

import java.util.Scanner;

public class Fibonacci {

    static int fibIteration(int n) {
        int fib1 = 0, fib2 = 1, fib3 = 1;
        for (int i = 0; i < n; i++) {
            fib1 = fib2;
            fib2 = fib3;
            fib3 = fib1 + fib2;
        }
        return fib1;
    }

    static int fibonacciRecursion(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacciRecursion(n-1) + fibonacciRecursion(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj index ciagu fibonaciego: ");
        int index = scanner.nextInt();
//        System.out.println(fibIteration(index));

        System.out.println(fibonacciRecursion(index));
    }
}
