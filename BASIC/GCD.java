//Q.Write a program to find the GCD/HCF of two numbers
//Test Cases :
//Input : 20 28   Output : 4
//Input : 98 56   Output : 14

import java.util.Scanner;

public class Practice6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first,second,result;
        System.out.print("Enter first number : ");
        first = sc.nextInt();
        System.out.print("Enter second number : ");
        second = sc.nextInt();
        result = gcd(first,second);
        System.out.println("GCD of " + first + " & " + second + " is " + result);

    }
    // Recursive Approach
    public static int gcd(int a , int b){
        if(a == 0){
            return b;
        }
        if(b == 0){
            return a;
        }
        if(a == b){
            return a;
        }
        if(a > b){
            return gcd(a-b,b);
        }

        return gcd(a,b-a);
    }
}
