//Write a program to merge two sorted array , the idea is to take two sorted arrays and merge them such that
//the resultant array is also sorted


import java.util.Arrays;
import java.util.Scanner;

public class secondLargest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,secLargest;

        System.out.print("Enter the size of the array : ");
        num = sc.nextInt();

        int[] arr = new int[num];

        for(int i=0 ; i < arr.length;i++){
            System.out.print("Enter the " + (i + 1) + " element of an array : ");
            arr[i] = sc.nextInt();
        }

        secLargest = secondLargest(arr);

        System.out.println("Elements of the array are : ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println("Second Largest element in an array is : " + secLargest);
        
    }

    public static int secondLargest(int[] arr){

        int n = arr.length;

        Arrays.sort(arr);
        
        for(int i = n - 2 ; i >= 0 ; i--){
            //This line checks The second last element is equal to the largest element or not .
            //If yes then go for next number
            if(arr[i] != arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
}



