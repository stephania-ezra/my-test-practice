package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ContinueLearn {
    private final Logger log = LogManager.getLogger(ContinueLearn.class);

    public static void main(String[] args) {
        ContinueLearn continueLearn = new ContinueLearn();
        continueLearn.checkContinue(4);
    }
    void checkContinue(int number){
        for ( int i= 0; i <10; i++) {
            if (i == number) {
                log.info("Continue at: {}", i);
                continue; // Skip the rest of the loop when i equals number
            }
            log.info("Current value of i: {}", i);
        }
    }
}
