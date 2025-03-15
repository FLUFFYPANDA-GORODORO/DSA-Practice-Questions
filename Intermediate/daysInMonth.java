//User enters date in dd-mm-yyyy find out number of days in the month (Ignore the concept of leap year)
//Input  : Date in dd-mm-yyyy format
//Output : Number of days in a month (entered by user)
//Test Cases :
//Input : 12-03-2006  Output : 31
//Input : 31-11-1996  Output : 30

import java.util.Scanner;

public class daysInMonth{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date;
        int day,month,year;

        System.out.print("Enter the date in dd-mm-yyyy format : ");
        date = sc.nextLine();
        String [] tokens = date.split("-");
        day = Integer.parseInt(tokens[0]);
        month = Integer.parseInt(tokens[1]);
        year = Integer.parseInt(tokens[2]);
        boolean leapYear = isLeapYear(year);

        if(day<=0 || month<=0 || month>12 || day>31){
            System.out.println("Invalid date");
        }
        else{
            int daysInMonth = getDaysInMonth(month,leapYear);
            System.out.println("Number of days in a month : " + daysInMonth);
        }

        if(leapYear){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Ordinary year");
        }
    }

    public static int getDaysInMonth(int month , boolean leapyear){
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> leapyear ? 29 : 28;
            default -> -1;
        };
    }

    public static boolean isLeapYear(int year){
        return (year % 400 ==0) || ((year % 4 == 0  && year % 100 != 0));
    }
}


//switch(month){
//  case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
//    return 31;
//  case 4 : case 6 : case 9 : case 11 :
//    return 30;
//  case 2 :
//    return leapyear ? 29 : 28;
//  default:
//    return -1;
// }

// #Output
// Enter the date in dd-mm-yyyy format : 12-03-2006
// Number of days in a month : 31
// Ordinary year
