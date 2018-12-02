
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
       
        if (year % 100 == 0) {
            int remainder400 = year % 400;
            if (remainder400 == 0) {
                System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
        } else {
            int remainder4 = year % 4;
            if (remainder4 == 0) {
                 System.out.println("The year is a leap year.");
            } else {
                System.out.println("The year is not a leap year.");
            }
            
        }

    }
}
