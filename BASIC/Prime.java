//Write a program to find all the possible prime numbers within the range
//Input : Two integers start and end of range
//Output : All possible prime numbers within this range
//Test Cases :
//Input : 1-10  Output 2 3 5 7
//Input : 1-100  Output 2 3 5 7 ......89 97


import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2;
        System.out.print("Enter starting number of range : ");
        n1 = sc.nextInt();
        System.out.print("Enter ending number of range : ");
        n2 = sc.nextInt();
        System.out.println("Prime numbers from range " + n1  + " to " + n2 + " are : ");
        for(int i = n1 ; i <= n2 ; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num){
        if(num < 0){
            return false;
        }

        if(num == 0)
            return false;

        if(num == 1)
            return false;

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
