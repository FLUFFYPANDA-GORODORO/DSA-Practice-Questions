//Write a program to convert Decimal number to Octal number
//Input : 33  Output : 41
//Input : 10  Output : 12

//Algorithm

//1.Divide the number by 8
//2.Store the remainder when the number is divided by 8 in an array
//3.Repeat the above steps until the number is greater than zero
//4.Print the array in reverse order

//Example : Let us consider the decimal number is 10

//1.Divide 10 by 8 & Store its remainder in arr[0]
//2.So , 10/8 = 1 & remainder = 2 . Therefore, arr[0]=2
//3.New number is 1 now . So, 1/8 = 0 & remainder = 1 . Therefore , arr[1]=1
//4.arr[] = {2,1} . Print this array in reverse order
//5.Final answer is 12


import java.util.Scanner;

public class Practice6 {

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
            arr[i] = num % 8;
            num = num / 8;
            i++;
        }
        System.out.print("The binary number of " + temp + " is ");
        for(int j = i-1;j>=0;j--){
            System.out.print(arr[j]);
        }

    }
}

