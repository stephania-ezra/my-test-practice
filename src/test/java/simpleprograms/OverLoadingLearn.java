package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OverLoadingLearn {
    private final Logger log = LogManager.getLogger(OverLoadingLearn.class);

    public static void main(String[] args) {
        OverLoadingLearn overLoadingLearn = new OverLoadingLearn();
        overLoadingLearn.plusMethod(5, 10);
        overLoadingLearn.plusMethod(5.5, 10.5);
    }

    void plusMethod(int x, int y) {
        int result = x + y;
        log.info("Sum of integers: {} + {} = {}", x, y, result);

    }

    void plusMethod(double x, double y) {
        double result = x + y;
        log.info("Sum of doubles: {} + {} = {}", x, y, result);
    }
}
