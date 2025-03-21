//Write a program to find all the possible prime numbers within the range
//Input : Two integers start and end of range
//Output : All possible prime numbers within this range & sum of all prime numbers within these range
//Test Cases :
//Input : 1-10  Output 2 3 5 7  sum = 17
//Input : 1-100  Output 2 3 5 7 11 ......89 97  sum = 1060 


import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,sum=0;
        System.out.print("Enter starting number of range : ");
        n1 = sc.nextInt();
        System.out.print("Enter ending number of range : ");
        n2 = sc.nextInt();
        System.out.println("Prime numbers from range " + n1  + " to " + n2 + " are : ");
        for(int i = n1 ; i <= n2 ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSum of all prime numbers is : " + sum);
    }

    public static boolean isPrime(int num){
        
        if(num < 2){
            retiurn false;

        int i , flag = 1;

        for(i = 2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0){
                flag=0;
                break;
            }
        }
        if(flag == 1)
            return true;

        return false;
    }
}

// if(num < 0){
//     return false;
// }

// if(num == 0)
//     return false;

// if(num == 1)
//     return false;

    
// #Output
// Enter starting number of range : 1
// Enter ending number of range : 10
// Prime numbers from range 1 to 10 are : 
// 2 3 5 7 
// Sum of all prime numbers is : 17
