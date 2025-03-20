//Write a program to find the LCM of two numbers
//Input : 15 , 20   Output : 60
//Input : 15 , 25   Output : 75
//Input : 30 , 60   Output : 60

//Logic
//LCM = Smallest number that divides both the numbers
//A simple logic is to find all the prime factors of both numbers then find union of all factors present in both nums.
//Finally return product of elements in union
//Ex :
//15 = 3 x 5 (prime factorization)
//25 = 5 x 5 (prime factorization)
//Union of all factors : 5^2(because 5 is present in both the numbers) & 3 ^ 1
//Union of all factors : 5^2 x 3^1 = 75

//An efficient solution is based on below formula for LCM to two numbers 'a' & 'b'.
//Product of two numbers = LCM * HCF
//a x b = LCM(a,b) * GCD(a,b)
//LCM(a,b) = a x b / GCD(a,b)


import java.util.Scanner;

public class LCM{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int first , second;
        int gcdOfNums,lcmOfNums;

        System.out.println("Enter first number : ");
        first = sc.nextInt();
        System.out.println("Enter second number : ");
        second = sc.nextInt();

        gcdOfNums = gcd(first,second);
        lcmOfNums = lcm(first,second);

        System.out.println("Lcm of " + first + " & " + second + " is " + lcmOfNums);

    }

    public static int gcd(int a , int b){
        if(a == 0)
            return b;
        return gcd(b % a , a);
    }

    public static int lcm(int a , int b){
        return (a*b)/gcd(a,b);
    }

}

