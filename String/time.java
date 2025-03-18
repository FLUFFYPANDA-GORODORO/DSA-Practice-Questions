//Given a time in 12-hour format am/pm format , convert it into a time in 24-hour format
//Input : time = 09:15:55 & meridian = pm  Output : 21:15:55
//Input : time = 12:00:00 & meridian = am  Output : 00:00:00
//Input : time = 03:55:50 & meridian = am  Output : 03:55:50


import java.util.Objects;
import java.util.Scanner;

public class time {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour,min,sec;
        String time,meridian;

        System.out.print("Enter the time in 12-hour format (hh:mm:ss) : ");
        time = sc.nextLine();

        System.out.print("Enter am/pm : ");
        meridian = sc.nextLine();

        String[] parts = time.split(":");
        hour = Integer.parseInt(parts[0]);
        min = Integer.parseInt(parts[1]);
        sec = Integer.parseInt(parts[2]);

        if(hour>0 && hour<=12 && min>=0 && min<=59 && sec>=0 && sec<=59 && (Objects.equals(meridian, "am") ||
                Objects.equals(meridian, "pm"))){
            if(Objects.equals(meridian, "pm") && hour!=12){
                hour += 12;
            }
            if(Objects.equals(meridian, "am") && hour==12){
                hour = 0;
            }
            System.out.println();
            System.out.println("The obtained 24-hour format is : ");
            System.out.println(hour + ":" + min + ":" + sec);
        }
        else{
            System.out.println("Provide correct input");
        }

    }
}

