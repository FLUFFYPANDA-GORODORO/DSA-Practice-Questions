//Program to check whether a number is a ArmStrong(Plus Perfect) Number or not
//Input  : Any positive Integer
//Output : Print "Success" if ArmStrong number . Print "Failure" if not ArmStrong number
//Test Cases :
//Input : 153   Output : "Success"
//Input : 1634  Output : "Success"

//1 Digit ArmStrong Number : (1,2,3,4,5,6,7,8,9)
//2 digit ArmStrong Number : None
//3 digit ArmStrong Number : 153  -> 1^3 + 5^3 + 3^3 = 153      Ex:- 153,370,371,407
//4 digit ArmStrong Number : 1634 -> 1^4 + 6^4 + 3^4 + 4^4 = 1634

import java.util.Scanner;

public class isArmStrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,result;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        result = (int) isArmStrong(num);

        if(num == result){
            System.out.println("Success");
        }
        else{
            System.out.println("Failure");
        }

    }

    public static int order(int num){

        int n=0;
        while(num>0){
            n++;
            num = num / 10;
        }
        return n;
    }

    public static double isArmStrong(int num){

        int n = order(num);
        int rem;
        double sum = 0;
        //Math.pow requires value to be in double

        while(num > 0){
            rem = num % 10;
            sum = sum + Math.pow(rem,n);
            num = num/10;
        }

        return sum;
    }
}

