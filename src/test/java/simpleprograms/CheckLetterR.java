package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class CheckLetterR {
    private final Logger log = LogManager.getLogger(CheckLetterR.class);

    public static void main(String[] args) {
        CheckLetterR checkLetterR = new CheckLetterR();
        checkLetterR.getCheckLetterR();
    }

    int count = 0;

    void getCheckLetterR() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter the String");
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char u = Character.toUpperCase(c);
            if (u == 'R') {
                count++;
            }
        }
        log.info("Count of R is:{}", count);
    }
}
