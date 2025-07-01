package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SumOfArrayElements {
    private final Logger log = LogManager.getLogger(SumOfArrayElements.class);

    public static void main(String[] args) {
        SumOfArrayElements sumOfArrayElements = new SumOfArrayElements();
        sumOfArrayElements.getSumOfArrayElements();
    }

    void getSumOfArrayElements() {
        int[] numbers = {1, 5, 10, 25};
        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }
        log.info("sum of the numbers array is:{}", sum);
    }
}
