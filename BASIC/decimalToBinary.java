//Write a program to convert Decimal number to Binary number
//Input : 7   Output : 111
//Input : 10  Output : 1010
//Input : 33  Output : 100001

//Algorithm

//1.Divide the number by 2
//2.Store the remainder when the number is divided by 2 in an array
//3.Repeat the above steps until the number is greater than zero
//4.Print the array in reverse order

//Example : Let us consider the decimal number is 10

//1.Divide 10 by 2 & Store its remainder in arr[0]
//2.So , 10/2 = 5 & remainder = 0 . Therefore, arr[0]=0
//3.New number is 5 now . So, 5/2 = 2 & remainder = 1 . Therefore , arr[1]=1
//4.New number is 2 now . So, 2/2 = 1 & remainder = 0 . Therefore , arr[2]=0
//4.New number is 1 now . So, 1/2 = 0 & remainder = 1 . Therefore , arr[3]=1
//5.arr[] = {0,1,0,1} . Print this array in reverse order
//6.Final answer is 1010


import java.util.Scanner;

public class decimalToBinary{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int decimal;

        System.out.print("Enter the decimal number : ");
        decimal = sc.nextInt();

        decimalToBinary(decimal);

    }

    public static void decimalToBinary(int num){
        int[] arr = new int[32];
        int i = 0;
        int temp = num;
        while(num > 0){
            arr[i] = num % 2;
            num = num / 2;
            i++;
        }
        System.out.print("The binary number of " + temp + " is ");
        for(int j = i-1;j>=0;j--){
            System.out.print(arr[j]);
        }

    }
}

