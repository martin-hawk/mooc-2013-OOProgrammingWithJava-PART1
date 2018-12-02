
import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers++;
        this.sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }

    public int sum() {
        // code here
        if (this.amountOfNumbers == 0) {
            return 0;
        } else {
            return this.sum;
        }
    }

    public double average() {
        // code here
        if (this.amountOfNumbers > 0) {
            return (double) sum() / amountOfNumbers();
        } else {
            return 0;
        }
    }
}
