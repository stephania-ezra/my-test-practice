package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/*
Program to PRINT the number of words in a String
i/p -> A RED SEED
OUTPUT-> SEED

 */
public class WordsPrint {
    private final Logger log = LogManager.getLogger(WordsPrint.class);

    public static void main(String[] args) {
        WordsPrint wp = new WordsPrint();
        wp.countWords();

    }

    void countWords() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter the Sentence");
        String s = sc.nextLine();

        s = s + " ";
        int count = 0;
        String word = "";
        String longestWord = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                word = word + c;
            } else {
                if (word.equalsIgnoreCase("OR")) {
                    count++;
                }
                word = "";
            }
        }
        if (count == 0) {
            log.info(" word " + " " + "OR" + " not found ");
        } else {
            log.info(" word   OR  found {} times ", count);
        }
    }
}
