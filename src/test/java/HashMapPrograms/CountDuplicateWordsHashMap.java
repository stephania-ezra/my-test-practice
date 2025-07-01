package HashMapPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateWordsHashMap {
    private final Logger log = LogManager.getLogger(CountDuplicateWordsHashMap.class);

    public static void main(String[] args) {
        CountDuplicateWordsHashMap countDuplicateWordsHashMap = new CountDuplicateWordsHashMap();
        countDuplicateWordsHashMap.getDuplicateWords();
    }

    void getDuplicateWords() {
        String s = "java is the best language the";
        ArrayList<String> wordsArrayList = new ArrayList<>();


        String word = "";
        s = s + ' ';
        //String traversal
        for (int i = 0; i < s.length(); i++) {
            char c = s.toLowerCase().charAt(i);
            if (c != ' ') {
                word = word + c;
            } else {
                wordsArrayList.add(word);
                word = " ";
            }
        }
        log.info(wordsArrayList);

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String str : wordsArrayList) {
            if (map.containsKey(str)) {
                int count = map.get(str);
                count++;
                map.replace(str, count);
            } else {
                map.put(str, 1);
            }
        }
        log.info(map);
//printing the key and value pair
      /*  for (String key : map.keySet()) {
            log.info("Word:{} Occurrences:{}", key, map.get(key));
        }*/

        Set<Map.Entry<String, Integer>>  frequencySet = map.entrySet();
        String maxWord = "";
        int maxValue = Integer.MIN_VALUE; //-21474836


        for(Map.Entry<String, Integer> frequency :frequencySet ){
            if(maxValue<frequency.getValue()){
                maxValue = frequency.getValue();
                maxWord = frequency.getKey();
            }
        }
        log.info("{} has greater frequency", maxWord);
    }

}
