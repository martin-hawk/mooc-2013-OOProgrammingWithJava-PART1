
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.
        // The tests does not work if you do not create the objects in the correct order
        NumberStatistics statsAll = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();
        int number;

        System.out.println("Type numbers: ");
        while (true) {
            number = Integer.parseInt(reader.nextLine());

            if (number == -1) {
                break;
            } else {
                statsAll.addNumber(number);
                if (number %2 == 0) {
                    statsEven.addNumber(number);
                } else {
                    statsOdd.addNumber(number);
                }
            }
        }

        System.out.println("sum: " + statsAll.sum());
        System.out.println("sum of even: " + statsEven.sum());
        System.out.println("sum of odd: " + statsOdd.sum());
    }
}
