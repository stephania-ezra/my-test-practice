package HashMapPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

/*
 input ->stephania
 output ->p1a2s1t1e1h1i1n1
 */
public class CountAlphabetOccurance {
    private final Logger log = LogManager.getLogger(CountAlphabetOccurance.class);

    public static void main(String[] args) {
        CountAlphabetOccurance countAlphabetOccurance = new CountAlphabetOccurance();
        countAlphabetOccurance.getCountOfAlphabets();
    }

    void getCountOfAlphabets() {
        String s = "stephania";

        //creating a hashmap
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        //String traversal
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c);
                count++;
                map.replace(c, count);
            } else {
                map.put(c, 1);
            }
        }

        //printing key and value

        for (Character key : map.keySet()) {
            System.out.print(key + "" + map.get(key));
        }
    }
}
