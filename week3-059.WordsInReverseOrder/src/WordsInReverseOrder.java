
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> wordlist = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();

            if (!input.isEmpty()) {
                wordlist.add(input);
            } else {
                break;
            }
        }
        System.out.println("You typed the following words:");
        Collections.reverse(wordlist);

        for (String word : wordlist) {
            System.out.println(word);
        }
    }
}
