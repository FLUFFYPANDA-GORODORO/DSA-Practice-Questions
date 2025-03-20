//Write a program to Segregate 0s and 1s in an array
//You are given an array of 0s & 1s in random order . Segregate 0s on left side and 1s on right side of the array
//Input  : [0,1,0,1,0,0,1,1,1,0]
//Output : [0,0,0,0,0,1,1,1,1,1]

//Algorithm
//Count the number of 0s. Let the count be "C"
//Once we have count , we can put "C" 0s at the beginning and 1s at the remaining "n - C" positions in an array

import java.util.Scanner;

public class segregate{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] newArr;
        int[] arr = {1,0,0,0,1,0,1};
        int n = arr.length;

        newArr = segregate(arr,n);

        System.out.println("The elements of the array are ");
        for(int i = 0 ; i < n ; i++){
            System.out.print(newArr[i] + " ");
        }
    }
    
    public static int[] segregate(int[] arr, int n){
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(arr[i] == 0)
                count++;
        }
        for(int i = 0 ; i < count ; i++){
            arr[i] = 0;
        }

        for(int i = count ; i < n ; i++){
            arr[i] = 1;
        }
        return arr;
    }
}

