package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;


/*
count the number of 'R' in the string
input -> Collins123google456
output -> 6

 */
public class CountDigits {
    private final Logger log = LogManager.getLogger(CountDigits.class);

    public static void main(String[] args) {

        CountDigits cd = new CountDigits();
        cd.countDigits();
    }

    void countDigits() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter a string");
        String s = sc.nextLine();

        int countDigit = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                countDigit++;
            }
        }
        log.info("Number of digits in the String is:{}", countDigit);
    }
}
