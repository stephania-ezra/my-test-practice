package HashMapPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class CountDuplicateCharacterOccurance {
    private final Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        CountDuplicateCharacterOccurance countDuplicateCharacterOccurance = new CountDuplicateCharacterOccurance();
        countDuplicateCharacterOccurance.getCharacterDuplicateCount();
    }

    void getCharacterDuplicateCount() {
        String s = "stephania";

        //creating a hashmap
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        //String Traversal
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            //check the character in the map
            if (map.containsKey(c)) {
                int count = map.get(c);
                count++;
                map.replace(c, count);
                log.info("Duplicate Character is: {} and its count is: {}", c, count);
            } else {
                map.put(c, 1);
            }
        }

       /* for (Character key : map.keySet()) {
            log.info("{}{}", key, map.get(key));
        }*/
    }
}
