package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


/*
input -> STEPHANIA
OUTPUT -> EAIA 4
 */
public class VowelsCount {
    private final Logger log = LogManager.getLogger(VowelsCount.class);

    public static void main(String[] args) {
        VowelsCount vc = new VowelsCount();
        vc.countVowels();
    }

    void countVowels() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter String");
        String s = sc.nextLine();

        int vowelCount = 0;
        String vowelString = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char u = Character.toUpperCase(c);

            if (u == 'A' || u == 'E' || u == 'I' || u == 'O' || u == 'U') {
                vowelCount++;
                vowelString = vowelString + u;
            }
        }
        log.info(vowelString);
        log.info("Vowel Count is:{}", vowelCount);
    }
}