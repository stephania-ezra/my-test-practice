package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/*

Input -> level
Output -> level

 */
public class Palindrome {
    private final Logger log = LogManager.getLogger(Palindrome.class);

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        palindrome.checkPalindrome();
    }

    void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter a String");
        String s = sc.nextLine();

        String reverseString = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            reverseString = c + reverseString;
        }
        if (s.equalsIgnoreCase(reverseString)) {
            log.info("Given String is a Palindrome");
        } else {
            log.info("Given String is not a Palindrome");
        }
    }
}
