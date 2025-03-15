//Program to find the  Count of digits , Sum of digits , Product of digits.
//Input  : Any positive Integer
//Output : Count & Reverse the number of digits . Sum & Product of digits

import java.util.Scanner;

public class Digits{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num , Count , Reverse , Sum , Product;

        System.out.print("Enter a number : ");
        num = sc.nextInt();

        Count = countNoOfDigits(num);
        System.out.println("Number of digits is : " + Count);

        Reverse = reverseNoOfDigits(num);
        System.out.println("Reverse of digits is : " + Reverse);

        Sum = sumOfDigits(num);
        System.out.println("Sum of digits is : " + Sum);

        Product = productOfDigits(num);
        System.out.println("Product of digits is : " + Product);

    }

    public static int countNoOfDigits(int num){
        int rem , count = 0;

        while(num>0){
            num = num/10;
            count++;
        }
        return count;
    }

    public static int reverseNoOfDigits(int num) {
        int rem , sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        return sum;
    }

    public static int sumOfDigits(int num) {
        int rem , sum = 0;

        while (num > 0) {
            rem = num % 10;
            sum += rem;
            num = num / 10;
        }
        return sum;
    }

    public static int productOfDigits(int num) {
        int rem,product = 1;

        if(num == 0){
            return 0;
        }
        else{
            while (num > 0){
                rem = num % 10;
                product *= rem;
                num = num / 10;
            }
            return product;
        }
    }
}


// #Output
// Enter a number : 5621
// Number of digits is : 4
// Reverse of digits is : 1265
// Sum of digits is : 14
// Product of digits is : 60
