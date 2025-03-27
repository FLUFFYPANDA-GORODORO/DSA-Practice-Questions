//Write a program to check whether a year is a leap year or not
//Input : 2016 Output : Leap Year
//Input : 2019 Output : Not Leap Year
import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year;
        boolean leap;

        System.out.print("Enter the year : ");
        year = sc.nextInt();

        leap = leapYear(year);

        if(leap){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }

    public static boolean leapYear(int year){

        if(year % 400 == 0)
            return true;
        if(year % 100 == 0)
            return false;
        if(year % 4 == 0)
            return true;

        return false;
    }
}



