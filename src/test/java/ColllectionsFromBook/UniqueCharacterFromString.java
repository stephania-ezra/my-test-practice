package ColllectionsFromBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Set;

/*
input -> "This is my collection program"
output ->[a, e, g, h, n, p, y]
 */
public class UniqueCharacterFromString {
    private final Logger log = LogManager.getLogger(UniqueCharacterFromString.class);

    public static void main(String[] args) {
        UniqueCharacterFromString uniqueCharacterFromString = new UniqueCharacterFromString();
        uniqueCharacterFromString.getUniqueCharacterFromString();
    }

    void getUniqueCharacterFromString() {
        String s = "This is my collection program";
        char[] charArray = s.toLowerCase().toCharArray();

        Set<Character> uniqueCharSet = new HashSet<Character>();
        Set<Character> duplicateCharSet = new HashSet<Character>();

        for (Character c : charArray) {
            if (!uniqueCharSet.add(c)) {
                duplicateCharSet.add(c);
            }
        }

        uniqueCharSet.removeAll(duplicateCharSet);
        log.info(uniqueCharSet);
    }
}

