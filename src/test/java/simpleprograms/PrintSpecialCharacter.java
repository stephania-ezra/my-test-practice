package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/*
input -> 123abc!@#$
 */
public class PrintSpecialCharacter {

    private final Logger log = LogManager.getLogger(PrintSpecialCharacter.class);

    public static void main(String[] args) {
        PrintSpecialCharacter printSpecialCharacter = new PrintSpecialCharacter();
        printSpecialCharacter.getSpecialCharacter();
    }

    void getSpecialCharacter() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter the String");
        String s = sc.nextLine();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                System.out.print(c);
            }
        }
    }
}
