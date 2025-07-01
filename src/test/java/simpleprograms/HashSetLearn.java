package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;

public class HashSetLearn {
    private final Logger log = LogManager.getLogger(HashSetLearn.class);

    public static void main(String[] args) {
        HashSetLearn hashSetLearn = new HashSetLearn();
        hashSetLearn.createHashSet();
    }

    void createHashSet() {
        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);

        for (int i = 0; i < 10; i++) {
            if (numbers.contains(i)) {
                log.info("HashSet contains: {}", i);
            } else {
                log.info("HashSet does not contain: {}", i);
            }
        }
    }
}
