package HashMapPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class CountDuplicateWord {
    private final Logger log = LogManager.getLogger(CountDuplicateWord.class);

    public static void main(String[] args) {
        CountDuplicateWord countDuplicateWord = new CountDuplicateWord();
        countDuplicateWord.getWordDuplicateCount();
    }

    void getWordDuplicateCount() {
        String s = "I am Stephania I am the best";

        String[] wordsArray = s.split(" ");

//create a hashmap to get duplicate word and count

        HashMap<String, Integer> map = new HashMap<String, Integer>();

        for (String word : wordsArray) {
            if (map.containsKey(word)) {
                int count = map.get(word);
                count++;
                map.replace(word, count);
                log.info("Duplicate word is:{} and its count is:{}", word, count);
            } else {
                map.put(word, 1);
            }
        }


     /*   //String traversal

     ArrayList<String> wordsArrayList = new ArrayList<String>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                word = word + c;
            } else {
                log.info(word);
               wordsArrayList = word;
                word = "";
            }
        }

       log.info(wordsArrayList.ArrayasList);
*/
        /*
        CountDuplicateWord.getWordDuplicateCount I
CountDuplicateWord.getWordDuplicateCount am
CountDuplicateWord.getWordDuplicateCount Stephania
CountDuplicateWord.getWordDuplicateCount I
CountDuplicateWord.getWordDuplicateCount am
CountDuplicateWord.getWordDuplicateCount the
CountDuplicateWord.getWordDuplicateCount best
CountDuplicateWord.getWordDuplicateCount best
CountDuplicateWord.getWordDuplicateCount best
CountDuplicateWord.getWordDuplicateCount best
CountDuplicateWord.getWordDuplicateCount best
CountDuplicateWord.getWordDuplicateCount best
CountDuplicateWord.getWordDuplicateCount best
CountDuplicateWord.getWordDuplicateCount best
         */

    }
}


