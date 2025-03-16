//Questions
//1.Check whether the given number is even or odd
//2.If the number is Divisible by 3 then print "Fizz" . If the number is divisible by 5 then print "Buzz"
//If the number is divisible by both then print "Fizz-Buzz"
//3.Multiply Two numbers without using * operator
//4.Sum of N Natural numbers
//5.Factorial of a number
//6.Type of number i.e Positive or negative


import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,a,b;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter first number : ");
        b = sc.nextInt();

        evenOdd(num);
        legendsEvenOdd(num);
        fizzBuzz(num);
        multiply(a,b);
        sumOfNaturalNumbers(num);
        factorial(num);
        typeOfNumber(num);
    }

    public static void evenOdd(int num){
        if(num % 2 == 0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }

    public static void legendsEvenOdd(int num){
        if((num & 1) == 1){
            System.out.println("Odd number");
        }
        else{
            System.out.println("Even number");
        }
    }

    public static void fizzBuzz(int num){
        if(num % 3 == 0 && num % 5 == 0){
            System.out.println("Fizz Buzz");
        }
        else if(num % 3 == 0){
            System.out.println("Fizz");
        }
        else if(num % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println("Not divisible by 3 & 5");
        }
    }

    public static void multiply(int a , int b){
        int result = 0;

        for(int i = 1 ; i <= b ; i++){
            result += a;
        }
        System.out.println("Multiplication of two number is : " + result);

    }

    public static void sumOfNaturalNumbers(int num){
        int sum=0;

        for(int i = 1; i <= num ; i++){
            sum += i;
        }

        System.out.println("Sum of natural numbers upto " + num + " is " + sum);
    }

    public static void factorial(int num){
        int fact=1;
        for(int i = 1; i<=num ; i++){
            fact *= i;
        }
        System.out.println("The value of " + num +"! is " + fact);
    }

    public static void typeOfNumber(int num){

        if(num > 0){
            System.out.println("Positive number");
        }
        else if(num == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative number");
        }
    }
    
}

