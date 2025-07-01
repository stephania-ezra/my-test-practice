package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraysLearn {
    private final Logger log = LogManager.getLogger(ArraysLearn.class);

    public static void main(String[] args) {
        ArraysLearn arraysLearn = new ArraysLearn();
        arraysLearn.printArrayElements();
    }
    void printArrayElements() {
        int[] numbers = {1, 2, 3, 4, 5};
        log.info("Array Elements:");
        for (int i = 0; i < numbers.length; i++) {
            log.info("Element at index {}: {}", i, numbers[i]);
        }
    }
}
