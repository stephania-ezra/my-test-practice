package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class NoWhiteSpace {
    private final Logger log = LogManager.getLogger(NoWhiteSpace.class);

    public static void main(String[] args) {
        NoWhiteSpace nws = new NoWhiteSpace();
        nws.removeWhiteSpace();
    }

    void removeWhiteSpace() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter a String");
        String str = sc.nextLine();

        String newString = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isWhitespace(c)) {
                newString = newString + c;
            }
        }
        log.info("String after WhiteSpace Removal:{}", newString);
    }
}
