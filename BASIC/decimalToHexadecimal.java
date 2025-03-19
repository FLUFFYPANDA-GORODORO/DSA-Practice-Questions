//Write a program to convert Decimal number to Hexadecimal number
//Input : 116  Output : 74
//Input : 10  Output : A
//Input : 10  Output : A
//Input : 2545  Output : 9F1

//Hexadecimal number uses 16 values to represent a number . Numbers from 0-9 are expressed by digits 0-9 and
//10-15 are represented using character from A-F . 10 : A , 11 : B , 12 : C , 13 : D , 14 : E , 15 : F

//Algorithm

//1.Divide the number by 16
//2.Store the remainder when the number is divided by 16 in a temporary variable .
//3.If temp is less than 10 then insert (48 + temp) in an array
//3.If temp is greater than or equals 10 then insert (55 + temp) in an array
//4.Repeat the above steps until the number is greater than zero
//5.Print the array in reverse order

//Example : Let us consider the decimal number is 2545

//1.Divide 2545 by 16 & Store its remainder in arr[0]
//2.So , 2545/16 = 159 & its remainder is 1 . Therefore , temp = 1
//3.Temp < 10 . So , charArr[0] = 1 + 48
//4.charArr[0] = 1
//5.Now new number is 159/16 = 9 & its remainder is 15 . Therefore , temp = 15
//6.Temp > 10 . So , charArr[1] = 15 + 55
//7.charArr[1] = F
//8.Now new number is 9/16 = 0 & its remainder is 9 . Therefore , temp = 9
//9.Temp > 10 . So , charArr[2] = 9 + 48
//10.charArr[1] = 9
//11.charArr = {1,F,9} . Print this array in reverse order
//12.Final answer is 9F1


import java.util.Scanner;

public class decimalToHexadecimal{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal;

        System.out.print("Enter the decimal number : ");
        decimal = sc.nextInt();

        decimalToHexaDecimal(decimal);

    }

    public static void decimalToHexaDecimal(int num){
        char[] arr = new char[100];
        int i = 0;
        int n = num;
        while(num > 0){
            int temp = 0;
            temp = num % 16;
            if(temp < 10){
                arr[i] = (char) (temp + 48);
                i++;
            }
            else{
                arr[i] = (char) (temp + 55);
                i++;
            }
            num = num/16;
        }
        System.out.print("The binary number of " + n + " is ");
        for(int j = i-1; j>=0 ;j--){
            System.out.print(arr[j]);
        }
    }
}

