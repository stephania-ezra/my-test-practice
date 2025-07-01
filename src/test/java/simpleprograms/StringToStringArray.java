package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringToStringArray {
    private final Logger log = LogManager.getLogger(StringToStringArray.class);

    public static void main(String[] args) {
        StringToStringArray stsa = new StringToStringArray();
        stsa.getStringArray();
    }

    void getStringArray() {
        String s = "Hello World How are you guys doing";

        String[] a = s.split(" ");
        for (String p : a) {
            log.info(p);
        }
    }
}
