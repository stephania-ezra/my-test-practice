package ColllectionsFromBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindCharacterWithGreaterFrequency {
    private final Logger log = LogManager.getLogger(FindCharacterWithGreaterFrequency.class);

    public static void main(String[] args) {
        FindCharacterWithGreaterFrequency findCharacterWithGreaterFrequency = new FindCharacterWithGreaterFrequency();
        findCharacterWithGreaterFrequency.getFindCharacterWithGreaterFrequency();
    }

    void getFindCharacterWithGreaterFrequency() {
        String s = "hello world hi hurrah";

        char[] charArray = s.toLowerCase().toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();


        char answer = ' ';
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
        Set<Map.Entry<Character, Integer>> frequencySet = map.entrySet();
        int maxValue = Integer.MIN_VALUE; //-21474836
        char maxChar = 0;

        for (Map.Entry<Character, Integer> frequency : frequencySet) {
            if (maxValue < frequency.getValue()) { //-214<4
                maxValue = frequency.getValue();
                maxChar = frequency.getKey();
            }
        }
        log.info("{} has greater frequency", maxChar);
    }
}


