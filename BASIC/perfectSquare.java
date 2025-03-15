//Program to find whether a given number is a perfect square or not
//Input  : Any Positive Integer
//Output : If perfect sq then print " Perfect square " and vice versa
//Test cases :
//Input : 25  Output : Perfect Square
//Input : 47  Output : Not a perfect Square


import java.util.Scanner;

public class perfectSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,intVar;
        double floatVar;

        System.out.print("Enter the number : ");
        num = sc.nextInt();

        floatVar = Math.sqrt(num);
        intVar = (int)floatVar;

        if((intVar * intVar) == num){
            System.out.println("Perfect Square");
        }
        else{
            System.out.println("Not a perfect square");
        }
    }
}


// #Output
// Enter the number : 25
// Perfect Square
// Enter the number : 47
// Not a perfect square

