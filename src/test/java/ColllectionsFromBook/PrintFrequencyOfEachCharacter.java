package ColllectionsFromBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class PrintFrequencyOfEachCharacter {
    private final Logger log = LogManager.getLogger(PrintFrequencyOfEachCharacter.class);

    public static void main(String[] args) {
        PrintFrequencyOfEachCharacter printFrequencyOfEachCharacter = new PrintFrequencyOfEachCharacter();
        printFrequencyOfEachCharacter.printFrequencyOfEachCharacter();
    }

    void printFrequencyOfEachCharacter() {
        String s = "This is my collection program";

        char[] charArray = s.toLowerCase().toCharArray();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (Character c : charArray) {
            if (map.containsKey(c)) {
                int count = map.get(c);
                count++;
                map.replace(c, count);
            } else {
                map.put(c, 1);
            }
        }

        log.info(map);
        //print character and the count
        for (Character key : map.keySet()) {
            log.info("Character:{} count{}", key, map.get(key));
        }

    }

}
