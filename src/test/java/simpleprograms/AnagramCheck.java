package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;


/*
first String -> Listen
Second String ->Silent
 */
public class AnagramCheck {
    private final Logger log = LogManager.getLogger(AnagramCheck.class);

    public static void main(String[] args) {
        AnagramCheck ac = new AnagramCheck();
        ac.checkAnagram();
    }

    void checkAnagram() {

        String firstString = "julie";
        String secondString = "lilyj";

        char[] a = firstString.toUpperCase().toCharArray();

        /*for (char f : a) {
            log.info("First Array Before Sorting:{}", f);
        }*/
        Arrays.sort(a);
        for (char f : a) {
            log.info("First Array After Sorting:{}", f);
        }

        char[] b = secondString.toUpperCase().toCharArray();
        Arrays.sort(b);
        for (char s : b) {
            log.info("Second Array After Sorting:{}", s);
        }

        if (Arrays.equals(a,b)) {
            log.info("Two strings are Anagram");
        } else {
            log.info("Not Anagram");
        }
    }
}
