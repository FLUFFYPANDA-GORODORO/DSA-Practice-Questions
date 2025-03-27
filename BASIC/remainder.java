//Given two positive integers num1 & num2 , the task is to find the remainder when bigger number is divided
//by smaller number
//Input : 5 , 3   Output : 2
//Input : 5 , 10  Output : 0

import java.util.Scanner;

public class remainder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1,num2;
        System.out.print("Enter first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        num2 = sc.nextInt();

        if(num1 > num2){
            System.out.println("The remainder after dividing " + num1 + " from " + num2 + " is " + num1 % num2);
        }
        else{
            System.out.println("The remainder after dividing " + num2 + " from " + num1 + " is " + num2 % num1);
        }
    }
}



