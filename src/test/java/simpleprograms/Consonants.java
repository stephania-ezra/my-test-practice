package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;
/*
iloveyou
vowel count ->5
consonant ->3
 */
public class Consonants {
    private final Logger log = LogManager.getLogger(Consonants.class);

    public static void main(String[] args) {
        Consonants consonants = new Consonants();
        consonants.getConsonants();
    }

    void getConsonants() {
        Scanner sc = new Scanner(System.in);
        log.info("enter the string");

        int vowelCount = 0;
        int consonantCount = 0;
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char u = Character.toUpperCase(c);
            if (u == 'A' || u == 'E' || u == 'I' || u == 'O' || u == 'U') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        log.info("Vowel Count:{}", vowelCount);
        log.info("ConsonantCount{}", consonantCount);
    }
}
