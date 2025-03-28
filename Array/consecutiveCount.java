//Given an array that contains only 0's & 1's return the count of maximum consecutive ones in an array


import java.util.Scanner;

public class consecutiveCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {0,1,1,1,0};
        int count = 1;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1 && (arr[i] == arr[i + 1])){
                count++;
            }
            else
                continue;
        }
        
        System.out.println(count);

    }
}



