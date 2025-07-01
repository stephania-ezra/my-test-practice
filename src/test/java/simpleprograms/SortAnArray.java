package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SortAnArray {
    private final Logger log = LogManager.getLogger(SortAnArray.class);

    public static void main(String[] args) {
        SortAnArray sortAnArray = new SortAnArray();
        sortAnArray.checkSortedArray();
    }

    void checkSortedArray() {
        String[] cars = {"Volvo", "BMW", "Altroz", "Audi", "Scorpio"};
        Arrays.sort(cars);

        for (String car : cars) {
            log.info("Sorted List:{}", car);
        }
    }
}
