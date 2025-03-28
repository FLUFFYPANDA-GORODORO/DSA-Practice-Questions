//Write a program to find if the given number is present in an array or not .If Yes Print "Present"
//Otherwise "Not Present"

import java.util.Scanner;

public class searchInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr =  {1,2,5,8,9,25,11,7,32,48};
        int num;

        System.out.print("Enter the number : ");
        num = sc.nextInt();

        int flag = 1;
        for(int i = 0;i < arr.length ; i++){
            if(arr[i] == num){
                flag = 0;
            }
        }

        if(flag == 0)
            System.out.println("Present");
        else
            System.out.println("Not Present");
    }
}



