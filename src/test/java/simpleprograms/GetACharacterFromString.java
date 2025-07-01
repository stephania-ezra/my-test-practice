package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetACharacterFromString {
    private final Logger log = LogManager.getLogger(GetACharacterFromString.class);

    public static void main(String[] args) {
        GetACharacterFromString gacfs = new GetACharacterFromString();
        gacfs.checkCharFromString();
    }

    void checkCharFromString() {
        String str = "Geeks";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i ==4) {
                log.info("Character is:{}", str.charAt(i));
            }
        }
    }
}
