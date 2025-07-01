package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoopLearn {
    private final Logger log = LogManager.getLogger(LoopLearn.class);

    public static void main(String[] args) {
        LoopLearn ll = new LoopLearn();
        ll.checkLoop();
    }

    void checkLoop() {
        String s = "Maami123#$%";
        String letterChar = "";
        String digitChar = "";
        String specialChar = "";


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetter(c)) {
                letterChar = letterChar + c;
            } else if (Character.isDigit(c)) {
                digitChar = digitChar + c;
            } else {
                specialChar = specialChar + c;
            }
        }
        log.info(letterChar);
        log.info(digitChar);
        log.info(specialChar);
    }
}
