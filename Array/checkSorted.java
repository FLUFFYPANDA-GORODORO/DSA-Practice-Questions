//Write a program to merge two sorted array , the idea is to take two sorted arrays and merge them such that
//the resultant array is also sorted


import java.util.Arrays;
import java.util.Scanner;

public class checkSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        boolean check;

        System.out.print("Enter the size of the array : ");
        num = sc.nextInt();

        int[] arr = new int[num];

        for(int i=0 ; i < arr.length;i++){
            System.out.print("Enter the " + (i + 1) + " element of an array : ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        check = checkSorted(arr);

        System.out.println();
        if(check)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");


    }

    public static boolean checkSorted(int[] arr){
        if(arr.length == 1)
            return true;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= arr[i+1])
                continue;
            else
                return false;
        }
        return true;
    }
}



