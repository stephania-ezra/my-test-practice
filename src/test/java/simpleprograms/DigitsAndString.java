package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class DigitsAndString {
    private final Logger log = LogManager.getLogger(DigitsAndString.class);

    public static void main(String[] args) {
        DigitsAndString das = new DigitsAndString();
        das.numberAndStringDigit();
    }

    void numberAndStringDigit() {

        String digitString = "";
        String alphabetString = "";

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                digitString = digitString + c;
            } else {
                alphabetString = alphabetString + c;
            }
        }
        String newString = digitString + alphabetString;
        log.info("New String is:{}", newString);
    }
}
