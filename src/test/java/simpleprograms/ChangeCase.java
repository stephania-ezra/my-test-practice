package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class ChangeCase {
    private final Logger log = LogManager.getLogger(ChangeCase.class);

    public static void main(String[] args) {
        ChangeCase cc = new ChangeCase();
        cc.checkCaseChange();
    }

    void checkCaseChange() {
        Scanner sc = new Scanner(System.in);

        log.info("Enter the String");
        String str = sc.nextLine();

        String reverseChar = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                reverseChar = reverseChar + Character.toLowerCase(c);
            } else {
                reverseChar = reverseChar + Character.toUpperCase(c);
            }
        }
        log.info(reverseChar);
    }
}
