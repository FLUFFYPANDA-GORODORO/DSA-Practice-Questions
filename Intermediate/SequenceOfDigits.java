//Print digits of a number in same order
//Input  : Any Positive Integer
//Output : Print digits of the input number in same order in space separated fashion

import java.util.Scanner;

public class SequenceOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        SequenceOfDigits(num);
        printDigits(num);
    }

    //Method 1 -> recursion
    public static void SequenceOfDigits(int num){
        int rem , sum = 0;

        //Terminating condition
        if(num == 0)
            return;

        rem = num % 10;
        SequenceOfDigits(num/10);
       // System.out.print(rem  + "  ");

    }

    //Method 2 -> array
    public static void printDigits(int num){
        int[] arr = new int[25];
        int i=0,j,rem;

        while(num > 0){
            rem = num % 10;
            arr[i] = rem;
            i++;
            num = num / 10;
        }

        System.out.println();
        System.out.println("Digits in reverse Order are : ");
        for(j = 0 ; j < i ; j++){
            System.out.print(arr[j] + "  ");
        }
        System.out.println();
        System.out.println("Digits in Same order are : ");
        for(j = i - 1 ; j > -1 ; j--){
            System.out.print(arr[j] + "  ");
        }

    }
}

//#Outpur
//Enter a number : 12345
//Digits in reverse Order are :
//5  4  3  2  1
//Digits in Same order are :
//1  2  3  4  5  


