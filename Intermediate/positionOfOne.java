//Write a program to return position of first "1" from right to left , in a binary representation of an Integer .
//Input : 18  Binary : 010010  Output : 2
//Input : 19  Binary : 010011  Output : 1

//Logic
//1.Calculate the 2's compliment of a number
//2. 2's compliment :- Pehle jitne bhi 0's ayenge wo sab o he rahenge or first 1 bhi waise he rahega .
// First 1 ke baad jo bhi hoga wo Ulta hoga
//3.Abhi binary number or 2's compliment ka "logical and" karo
//4.Jo number aya uska decimal nikalo
//5.Iss decimal number ka log base 2 lelo and usme + 1 krdo . Jo bhi result ayega wo humara answer hoga


//Steps
//1.Take two's compliment of the given number as all bits are reverted except the first 1 from the right to left
//2.Do a bit wise &  of 2's compliment number with original number
//3.Take log2 of the number & Add 1 to it

//Ex : 12
//Binary : 1100  2's compliment : 0100
//1100 & 0100 = 0100
//0100 -> decimal -> 4
//log2(4) = 2
//2 + 1 = 3
//Answer = 3

import java.util.Scanner;

public class positionOfOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num,result;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        result = target(num);
        System.out.println("Position of 1 from right to left is : " + result);

    }
    public static int target(int num){
        return log2(num & -num) + 1;
    }

    public static int log2(int N) {
        return (int)(Math.log(N) / Math.log(2));
    }
}



