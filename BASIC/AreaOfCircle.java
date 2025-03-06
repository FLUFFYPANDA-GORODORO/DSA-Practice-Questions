//Q.Write a program to find area of circle when diameter is given
//Input : Any positive integer denoting diameter
//Output : Area of circle with two precision points
//Test Case :
//Input : 3  Output : 7.07
//Input : 5  Output : 19.63

import java.util.Scanner;

public class AreaOfCircle{

    static final double PI = Math.PI;
    //OR
    // static final double Pie = 3.14;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius , diameter , area;

        System.out.print("Enter the diameter of the circle : ");
        diameter = sc.nextDouble();

        radius = (float)diameter/2;
        // Explicit Typecasting ---> because we are dividing float/int but in some cases int/int can also happen so
        // the compiler will give int output . That's why we need to typecast it into float
        // Ex : (7/2 = 3 ) without typecast
        // Ex : ((float)7/2 = 3.5) with typecast

        area = PI * radius * radius;
        //Or
        // area = PI * Math.pow(radius,2);
        System.out.println("Area of circle is " + String.format("%.2f",area));
        // String.format("%.2f",area) -> Gives answer in two decimal points
        
    }
}
