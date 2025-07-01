package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringArrayLearn {
    private final Logger log = LogManager.getLogger(StringArrayLearn.class);

    public static void main(String[] args) {
        StringArrayLearn stringArrayLearn = new StringArrayLearn();
        stringArrayLearn.printStringArrayElements();
    }
    void printStringArrayElements() {
        String[] cars = {"BMW", "Volvo", "Breeza", "Altroz" , "Swift"};
        log.info("Printing String Array Elements:");
        /*for (int i = 0; i < cars.length; i++) {
            log.info("Element at index {}: {}", i, cars[i]);
        }*/
        for (String car : cars) {
            log.info("Car: {}", car);
        }
    }
}
