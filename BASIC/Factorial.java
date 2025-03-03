
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

// ------------------------------------------------------------------------------------------------
// Recursive Approach

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fact,result;
        System.out.print("Enter the the number : ");
        fact = sc.nextInt();

        result = factorial(fact);
        System.out.println("The Factorial of "+ fact +" is " + result);

    }

    public static int factorial(int n){
        if(n == 0){            //Terminating condition
            return 1;
        }
        else{                  //Recursive condition 
            return n * factorial(n-1);
        }
        // Decomposition - factorial(n-1)
        // Composition - n * ___
    }
}



// # Output
// Enter the the number : 5
// The Factorial of 5 is 120


