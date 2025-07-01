package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


/*
 input -> i am Geeks for Geeks and a Geek
 output -> am
 Geek
 */
public class EvenLengthWord {
    private final Logger log = LogManager.getLogger(EvenLengthWord.class);

    public static void main(String[] args) {
        EvenLengthWord elw = new EvenLengthWord();
        elw.printingEvenLengthWords();

    }

    void printingEvenLengthWords() {

        Scanner sc = new Scanner(System.in);
        log.info("Enter a String");
        String s = sc.nextLine();

        s = s + " ";
        String word = "";
        int count = 0;
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                word = word + c;
            } else {
                count++;
                length = word.length();
                if (length % 2 == 0) {
                    log.info("Even Length words are:{}", word);
                }
                word = "";
            }
        }
    }
}
