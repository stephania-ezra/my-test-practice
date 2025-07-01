package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sample {
    private final Logger log = LogManager.getLogger(Sample.class);


    public static void main(String[] args) {
        Sample myObj = new Sample();
        myObj.printX();
    }

    void printX() {
        int x = 5;
        log.info("Value of x: {}", x);
    }

}
