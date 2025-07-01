package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RemoveLeadingZero {
    private final Logger log = LogManager.getLogger(RemoveLeadingZero.class);

    public static void main(String[] args) {
        RemoveLeadingZero rlz = new RemoveLeadingZero();
        rlz.checkZero();
    }

    void checkZero() {
        String s = "00000123569";
        int length = s.length();
        log.info(length);

        String newString = "";
        newString = s.substring(5);
        log.info(newString);
    }
}
