//Write a program to convert Binary number to Decimal number
//Input : 111     Output : 7
//Input : 1010    Output : 10
//Input : 100001  Output : 33


import java.util.Scanner;

public class binaryToDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        boolean check;
        int decimal;

        System.out.print("Enter a Binary number : ");
        num = sc.nextInt();

        check = checkDigits(num);
        
        if(check){
            decimal = binaryToDecimal(num);
            System.out.println("The decimal value of " + num + " is " + decimal);
        }
        else{
            System.out.println("Invalid Binary number . Please enter a Valid Binary number");
        }
    }
    public static boolean checkDigits(int num){

        while(num > 0){
            int rem = num % 10;
            if(rem == 0 || rem==1){
                num = num/10;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public static int binaryToDecimal(int num){
        int temp = num;
        int decimalValue = 0;
        int base = 1;

        while(temp > 0){
            int rem = temp % 10;
            temp = temp/10;
            if(rem != 0){
                decimalValue += rem * base;
            }
            base *= 2;
        }
        return decimalValue;
    }
}

