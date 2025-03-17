//Given an array of elements which may or may consist duplicate value . Find the First & Last occurrence of an
//element x int the given array . If the element is not present in array then simply print "No occurrences" .
//Input  : Array of elements & element x (ex:- arr = [7,5,4,5,2,5] & x = 5)
//Output : First occurrence : 1  , Last occurrence : 5
//Input  : arr = [1,3,5,5,5,5,67,123]  Output : FO : 2 , LO : 5
//Input  : arr = [1,3,5,5,5,5,7,123]  Output : FO : 6 , LO : 6

//Logic :
//0.Sort the array (Optional)

//1.Run a for loop for i = 0 to i < n (n-1)
//2.Take first = -1 & last = -1 (If no element is found then FO & LO remains -1)
//3.After searching whole array : If FO = -1 then "No occurrence" & If LO = -1 then "No occurrence"
//4.When we find element "x" first time then update first = i (No change after this)
//5.We always update last = i whenever we find the occurrence of element "x"
//6.We print First Occurrence & Last Occurrence

import java.util.Scanner;

public class FirstLastOcc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[25];
        int n,num;

        System.out.print("Enter the size of the array : ");
        n = sc.nextInt();

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the " + (i+1) + " element of array : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be searched : ");
        num = sc.nextInt();

        findFirstLast(arr,num,n);

    }

    public static void findFirstLast(int[] arr, int num , int n){
        int first = -1;
        int last = -1;

        for(int i = 0; i < n; i++){
            if(num != arr[i]){
                continue;
            }
            if(first == -1)
                first = i;
            last = i;
        }
        if(first != -1){
            System.out.println("First Occurrence : " + first + ", Last Occurrence : " + last);
        }
        else {
            System.out.println("No Occurrences");
        }
    }
}

