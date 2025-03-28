//Given an array Of elements containing N natural numbers from 1 to N-1.Find the missing number in the array . 
//No need to add the missing element in the array . Just print the missing value / return the missing value.
//Input : {1,2,4,5}  Output : 3 (3 is missing in the array)
//Input : {1,3,4,5}  Output : 2 (2 is missing in the array)

import java.util.Scanner;

public class missingValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr =  {1,2,4,5};
        int num;

        for(int i = 0;i < arr.length;i++){
            if(arr[i] != i + 1){
                System.out.println(i+1);
                break;
            }
            else
                continue;
        }
    }
}



