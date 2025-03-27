//Write a program to merge two sorted array , the idea is to take two sorted arrays and merge them such that the resultant array is also sorted


import java.util.Scanner;

public class mergeTwoSortedArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr1 = {0,2,6,7};
        int [] arr2 = {1,2,3,4};

        result(arr1,arr2);

    }

    public static void result(int[] arr1,int[] arr2){
        int i,j,k;
        i = j = k = 0;

        int m = arr1.length;
        int n = arr2.length;
        int[] resultArr = new int[m + n];

        while(i < m && j < n){
            if(arr1[i] < arr2[j]){
                resultArr[k] = arr1[i];
                k++;
                i++;
            }
            else{
                resultArr[k] = arr2[j];
                k++;
                j++;
            }
        }

        while(i < m){
            resultArr[k] = arr1[i];
            k++;
            i++;
        }
        while(j < n){
            resultArr[k] = arr2[j];
            k++;
            j++;
        }


        for(i = 0; i < resultArr.length ; i++){
            System.out.print(resultArr[i] + " ");
        }
    }
}



