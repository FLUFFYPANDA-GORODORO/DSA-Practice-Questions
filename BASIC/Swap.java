//Swap the values of two variables
//Input  : Any two Positive Integers
//Output : Swap the values of these two variables
//Test Case :
//Input : a = 4 , b = 6  Output : a = 6 , b = 4

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b;

        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt();

        System.out.println("Value of first number before swap : " + a);
        System.out.println("Value of second number before swap : " + b);
        System.out.println();
        
        normalSwap(a,b);
        swapWithoutTemp(a,b);
        legendsSwap(a,b);

    }
    //Swapping the values of two variables with third variable
    public static void normalSwap(int a , int b){
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of first number after swap : " + a);
        System.out.println("Value of second number after swap : " + b);

    }

    //Swapping the values of two variables without third variable
    public static void swapWithoutTemp(int a , int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of first number after swap : " + a);
        System.out.println("Value of second number after swap : " + b);

    }

    //Swapping the values of two variables using bitwise operator
    public static void legendsSwap(int a , int b){

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Value of first number after swap : " + a);
        System.out.println("Value of second number after swap : " + b);

    }
}

