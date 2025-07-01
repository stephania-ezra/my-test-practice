package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReplaceCharacterInString {
    private final Logger log = LogManager.getLogger(ReplaceCharacterInString.class);

    public static void main(String[] args) {
        ReplaceCharacterInString rcis = new ReplaceCharacterInString();
        rcis.checkReplace();
    }

    void checkReplace() {
        String s = "Geeks Gor Geeks";
        int index = 6;
        char ch = 'F';

        String newString = "";
        log.info("Given String is:{}", s);

        newString = s.substring(0, index) + ch + s.substring(index + 1);
        log.info(newString);
    }
}
