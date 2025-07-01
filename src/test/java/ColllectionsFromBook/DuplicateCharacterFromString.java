package ColllectionsFromBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;

public class DuplicateCharacterFromString {
    private final Logger log = LogManager.getLogger(DuplicateCharacterFromString.class);

    public static void main(String[] args) {
        DuplicateCharacterFromString duplicateCharacterFromString = new DuplicateCharacterFromString();
        duplicateCharacterFromString.getDuplicateCharacterFromString();
    }

    void getDuplicateCharacterFromString() {
        //String s = "I am Stephania";
        // String s = "This is my collection program";
        String s = "Hello";
        log.info(s.length());

        char[] lowerCaseArray = s.toLowerCase().toCharArray();

        HashSet<Character> uniqueCharSet = new HashSet<Character>();
        HashSet<Character> duplicateCharSet = new HashSet<Character>();

        for (char c : lowerCaseArray) {
            if (!uniqueCharSet.add(c)) {
                duplicateCharSet.add(c);
            }
        }

        log.info(duplicateCharSet);

    }
}

