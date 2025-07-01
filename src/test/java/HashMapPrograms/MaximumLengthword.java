package HashMapPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class MaximumLengthword {
    private final Logger log = LogManager.getLogger(MaximumLengthword.class);

    public static void main(String[] args) {
        MaximumLengthword maximumLengthword = new MaximumLengthword();
        maximumLengthword.getMaximumLengthWord();
    }

    void getMaximumLengthWord() {

        // String s = "I am Stephania";
        String s = "Learning Java Program is not easy but once you learn java it is easy and interesting";
        int maxLength = 0;
        String MaxLengthWord = "";

        String[] stringArray = s.split(" ");
        for (String str : stringArray) {
            int length = str.length();
            if (length > maxLength) {
                maxLength = length;
                MaxLengthWord = str;
            }
        }
        log.info("Maximum Length word is:{} Length is:{}", MaxLengthWord, maxLength);
    }
}
