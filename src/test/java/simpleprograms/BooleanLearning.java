package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BooleanLearning {
    private final Logger log = LogManager.getLogger(BooleanLearning.class);

    public static void main(String[] args) {
        BooleanLearning bl = new BooleanLearning();
        bl.checkTrueOrFalse();
    }

    void checkTrueOrFalse() {
        int number = 36;
        if (number > 0) {
            log.info("positive number");
        } else if (number < 0) {
            log.info("negative number");
        } else {
            log.info("number is 0");
        }
    }
}
