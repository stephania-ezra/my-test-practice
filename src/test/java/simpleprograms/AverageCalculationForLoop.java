package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AverageCalculationForLoop {
    private final Logger log = LogManager.getLogger(AverageCalculationForLoop.class);

    public static void main(String[] args) {
        AverageCalculationForLoop averageCalculation = new AverageCalculationForLoop();
        averageCalculation.calculateAverage();
    }

    void calculateAverage() {
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};
        int sum = 0;
        int count = ages.length;

        for (int age : ages) {
            sum += age; // Add each age to the sum
        }

        double average = (double) sum / count; // Calculate average
        log.info("Sum: {}, Count: {}, Average: {}", sum, count, average);
    }
}
