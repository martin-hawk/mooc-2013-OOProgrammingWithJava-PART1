
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> wordList = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String input = reader.nextLine();

            if (!input.isEmpty()) {
                wordList.add(input);
            } else {
                break;
            }
        }

        Collections.sort(wordList);
        System.out.println("You typed the following words:");

        for (String string : wordList) {
            System.out.println(string);
        }
    }
}
