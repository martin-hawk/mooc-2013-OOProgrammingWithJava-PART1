
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grades grades = new Grades();
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        System.out.println("Type exam scores, -1 completes:");

        while (true) {
            int value = Integer.parseInt(reader.nextLine());
            if (value != -1) {
                grades.countGrades(value);
            } else {
                break;
            }
        }

        grades.printGrades();
    }
}
