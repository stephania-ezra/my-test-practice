package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class UpperCaseAndLowerCase {
    private final Logger log = LogManager.getLogger(UpperCaseAndLowerCase.class);

    public static void main(String[] args) {
        UpperCaseAndLowerCase ucalc = new UpperCaseAndLowerCase();
        ucalc.upperAndLowerCase();
    }

    void upperAndLowerCase() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String upperCaseString = "";
        String lowerCaseString = "";
        String newString = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCaseString = upperCaseString + c;
            } else {
                lowerCaseString = lowerCaseString + c;
            }
        }
        newString = upperCaseString + lowerCaseString;
        log.info("New String is:{}", newString);
    }
}
