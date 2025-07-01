package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;

public class HashSetLearning {
    private final Logger log = LogManager.getLogger(HashSetLearning.class);

    public static void main(String[] args) {
        HashSetLearning hashSetLearning = new HashSetLearning();
        hashSetLearning.getHashSetLearning();
    }

    void getHashSetLearning() {
        // String data type HashSet
        /*HashSet<String> fruits = new HashSet<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("pineapple");
        fruits.add("pineapple");

        log.info(fruits);

        log.info(fruits.size());

        //log.info(fruits.contains("orange"));

        log.info(fruits.remove("orange"));
        log.info(fruits);

        log.info(fruits.size());*/

        //Integer data type HashSet
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        log.info(numbers);
        for (Integer number : numbers) {
            log.info(number);
        }

    }
}
