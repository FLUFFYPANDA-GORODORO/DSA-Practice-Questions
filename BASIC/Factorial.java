
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fact,result=1;
        System.out.print("Enter the the number : ");
        fact = sc.nextInt();

        for(int i = 2 ; i<=fact ; i++){
            result = result * i;
        }
        System.out.println("The Factorial of "+ fact +" is " + result);
    }
}


// # Output
// Enter the the number : 5
// The Factorial of 5 is 120


