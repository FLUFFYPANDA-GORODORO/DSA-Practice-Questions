//Write a program to find second greatest & second smallest of three numbers (Given 3 numbers may or may not be equal)
//Input  : Three unique numbers
//Output : Second Greatest & smallest number
//Test Case :
//Input : 12 8 47  Output : 12 & 12
//Input : -1 0 -8  Output : -1 & -1

import java.util.Scanner;

public class SecondMinMax {

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
        System.out.println("Second Maximum of three numbers is : " + max);
        min = Minimum(n1,n2,n3);
        System.out.println("Second Minimum of three numbers is : " + min);
    }

    public static int Maximum(int n1 , int n2 , int n3){
        int Secmax = 0;
        if(n1>=n2 && n1>=n3){
            if(n2>=n3){
               Secmax = n2;
            }
            else{
               Secmax = n3;
            }
        }
          
        else if(n2>=n1 && n2>=n3){
            if(n1>=n3){
                Secmax = n1;
            }
            else{
                Secmax = n3;
            }
        }
          
        else if(n3>=n2 && n3>=n1){
            if(n1>=n2){
                Secmax = n1;
            }
            else{
                Secmax = n2;
            }
        }
        else{
            System.out.println("Invalid Values");
        }

        return Secmax;
    }

    public static int Minimum(int n1 , int n2 , int n3){
        int Secmin = 0;
        if(n1<=n2 && n1<=n3){
            if(n2<=n3){
               Secmin = n2;
            }
            else{
               Secmin = n3;
            }
        }
        else if(n2<=n1 && n2<=n3){
            if(n1<=n3){
                Secmin = n1;
            }
            else{
                Secmin = n3;
            }
        }
        else if(n3<=n2 && n3<=n1){
            if(n1<=n2){
                Secmin = n1;
            }
            else{
                Secmin = n2;
            }
        }
        else{
            System.out.println("Invalid Values");
        }

        return Secmin;
    }

}

// #Output
// Enter the first number : 12
// Enter the second number : 8
// Enter the third number : 47
// Second Maximum of three numbers is : 12
// Second Minimum of three numbers is : 12
