//Write a program to count Set bits in an integer
//Input : 6  Output : 2
//Input : 8  Output : 1

//In a binary number ,
//Reset bit : 0
//Set bit : 1


import java.util.Scanner;

public class countOfSetBit{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int count = 0;
        int[] newArr;

        System.out.print("Enter a positive integer : ");
        num = sc.nextInt();

        newArr = decimalToBinary(num);

        for (int j : newArr) {
            if (j == 1) {
                count++;
            }
        }
        System.out.println();
        System.out.println("Count of set digits in " + num + " is " + count);
    }

    public static int[] decimalToBinary(int num){
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
        return arr;
    }
}


//        for(int i = 0 ; i < newArr.length ; i++){
//            if(newArr[i] == 1){
//                count++;
//            }
//        }


