
import java.util.Random;

public class PasswordRandomizer {

    // Define the variables
    private Random random = new Random();
    private int lenght;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.lenght = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        String string = "";

        while (i < this.lenght) {
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(random.nextInt(25));
            string += symbol;
            i++;
        }

        return string;
    }
}
