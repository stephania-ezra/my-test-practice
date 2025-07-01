package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/*
count the number of 'R' in the string
input -> RachelRohitRoller
output -> 4

 */

public class CountingALetter {

    private final Logger log = LogManager.getLogger(CountingALetter.class);

    public static void main(String[] args) {

        CountingALetter cal = new CountingALetter();
        cal.countR();
    }

    void countR() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter a string");
        String s = sc.nextLine();

        int countR = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char u = Character.toUpperCase(c);

            if (u == 'R') {
                countR++;
            }
        }
        log.info("Number of 'R' in the String is:{}", countR);
    }
}
