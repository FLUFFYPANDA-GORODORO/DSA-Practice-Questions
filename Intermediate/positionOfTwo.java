//Given two numbers M and N . The task is to find the position of rightmost different bit in a binary representation
//of two numbers
//Input : 9   11  Output : 2
//Input : 52  4   Output : 5

//1.Odd  numbers binary representation ends with 1
//2.Even numbers binary representation ends with 0

//Logic
//1.Two numbers m & n(9 & 11) . m = 1011 n = 1001
//2.1011 ^ 1001 (Xor) = 0010 -> (now this is the original number)
//3.Take two's compliment of the given number as all bits are reverted except the first 1 from the right to left
//4.Do a bit wise & of 2's compliment number with original number
//5.Take log2 of the number & Add 1 to it

import java.util.Scanner;

public class Practice6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1,num2,result;

        System.out.print("Enter first number : ");
        num1 = sc.nextInt();
        System.out.print("Enter second number : ");
        num2 = sc.nextInt();

        result = target(num1 ^ num2);
        System.out.println("Position of rightmost different bit of two number is : " + result);

    }
    public static int target(int num){
        return log2(num & -num) + 1;
    }

    public static int log2(int N) {
        return (int)(Math.log(N) / Math.log(2));
    }
}



