
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        Birdwatch birdwatch = new Birdwatch();

        while (true) {
            System.out.print("? ");
            String input = reader.nextLine();
            if (input.equals("Add")) {
                birdwatch.addBird(getInput("name", reader), getInput("latinName", reader));
            } else if (input.equals("Observation")) {
                if (!birdwatch.addObservation(getInput("observed", reader))) {
                    System.out.println("Is not a bird!");
                }
            } else if (input.equals("Statistics")) {
                birdwatch.printStatistics();
            } else if (input.equals("Show")) {
                birdwatch.showBird(getInput("what", reader));
            } else if (input.equals("Quit")) {
                break;
            }
        }
    }

    public static String getInput(String which, Scanner reader) {
        if (which.equals("name")) {
            System.out.print("Name: ");
        } else if (which.equals("latinName")) {
            System.out.print("Latin Name: ");
        } else if (which.equals("observed")) {
            System.out.print("What was observed:? ");
        } else if (which.equals("what")) {
            System.out.print("What? ");
        }
        String input = reader.nextLine();
        return input;
    }
}
