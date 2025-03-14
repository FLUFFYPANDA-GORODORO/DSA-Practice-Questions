//Write a program to find if the number is prime or not if number is prime then print number and print
//the square root of the number upto two decimals points precision
//Input : a positive integer
//Output : Prime number & square root of the number (If number is prime) .If not prime then print not a prime number
//Test Cases :
//Input : 5   Output : 5 is prime number & sq root is 2.24
//Input : 22  Output : 22 is not a prime number


import java.util.Scanner;

public class isPrime{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,flag=1;

        System.out.print("Enter a number : ");
        n = sc.nextInt();

        for(i = 2 ; i <= Math.sqrt(n) ; i++){
            if(n % i == 0){
                flag = 0;
                break;
            }
        }

        if(flag == 1){
            System.out.println(n + " is a prime number & square root is " + String.format("%.2f",Math.sqrt(n)));
        }
        else{
            System.out.println(n + " is not a prime number ");
        }
    }
}

// // #Output
// Enter a number : 5
// 5 is a prime number & square root is 2.24

// Enter a number : 22
// 22 is not a prime number 

