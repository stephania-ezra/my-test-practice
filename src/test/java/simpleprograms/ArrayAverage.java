package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayAverage {
    private final Logger log = LogManager.getLogger(ArrayAverage.class);

    public static void main(String[] args) {
        ArrayAverage arrayAverage = new ArrayAverage();
        arrayAverage.getArrayAverage();
    }

    void getArrayAverage() {
        int[] numbers = {20, 22, 18, 35, 48, 26, 87, 70};
        int average = 0;
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            average = sum / numbers.length;
        }
        log.info("Array Average is:{}", average);
    }
}
