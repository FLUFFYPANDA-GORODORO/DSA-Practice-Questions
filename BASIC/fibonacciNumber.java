//Write a program to print fibonacci series upto certain number n .
//Input : 10  Output : 0 1 1 2 3 5 8 13 21 34 55
//Write a program to print n-th Fibonacci number
//Input : 10  Output : 55
//Assume that Fibonacci series starts from 0 & 1 i.e Oth digit is "0" & First digit is "1" & so on ...

import java.util.Scanner;

public class fibonacciNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,n;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        normalFibonacci(num);
        fibonacci(num);

        n = fibo(num);
        System.out.println("The " + num + "th fibonacci number is " + n);

    }


    //Fibonacci using array
    public static void fibonacci(int num){
        int[] fib = new int[num + 1];
        fib[0] = 0;
        fib[1] = 1;

        System.out.println("The fibonacci series upto " + num + " is :");
        System.out.print("0 1 ");
        for(int i = 2 ; i <= num ; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
            System.out.print(fib[i] + " ");
        }
        System.out.println();
        System.out.println("The " + num + "th fibonacci number is " + fib[num]);
    }

    //Fibonacci using normal method
    public static void normalFibonacci(int num){
        int n1 = 0 , n2 = 1;
        int n3;
        if(num == 0){
            System.out.println("The " + num + "th fibonacci number is " + num);
        }
        System.out.println("The fibonacci series upto " + num + " is :");
        System.out.print("0 1 ");
        for(int i = 2 ; i <= num ; i++){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
        }
    }


    //Fibonacci using recursion
    public static int fibo(int num){
        if(num == 0)
            return 0;
        else if(num == 1)
            return 1;
        else{
            return fibo(num - 1) + fibo(num - 2);
        }
    }
}

