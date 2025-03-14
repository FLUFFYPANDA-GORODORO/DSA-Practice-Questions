//Write a program to find greatest & smallest of three numbers (Given 3 numbers are not equal)
//Input  : Three unique numbers
//Output : Greatest & smallest number
//Test Case :
//Input : 12 8 47  Output : 47 & 8
//Input : -1 0 -8  Output : 0 & -8

import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3,max,min;
        System.out.print("Enter the first number : ");
        n1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        n2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        n3 = sc.nextInt();

        max = Maximum(n1,n2,n3);
        System.out.println("Maximum of three numbers is : " + max);
        min = Minimum(n1,n2,n3);
        System.out.println("Minimum of three numbers is : " + min);
    }

    public static int Maximum(int n1 , int n2 , int n3){
        int max;
        //int max = Math.max(n1, n2);
        //if(n3 > max)
        //    max = n3;
        if(n1>n2)
            max = n1;
        else
            max = n2;
        if(n3 > max)
            max = n3;

        return max;
    } 
    
    public static int Minimum(int n1 , int n2 , int n3){
        int min;
        //int min = Math.min(n1, n2);
        //if(n3 < min)
        //    min = n3;
        if(n1<n2)
            min = n1;
        else
            min = n2;
        if(n3 < min)
            min = n3;

        return min;
    }
}
