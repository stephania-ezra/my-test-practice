package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BooleanLearn {
    private final Logger log = LogManager.getLogger(BooleanLearn.class);

    public static void main(String[] args) {
        BooleanLearn bl = new BooleanLearn();
        bl.booleanCheck();
    }

    void booleanCheck() {
        boolean isJavaFun = true;
        boolean isCollinsUgly = false;
        char myChar = 'C';
        String name = "Stephania";
        log.info("isJavaFun: {}", isJavaFun);
        log.info("isCollinsUgly: {}", isCollinsUgly);
        log.info(myChar);
        log.info(name);
    }
}
