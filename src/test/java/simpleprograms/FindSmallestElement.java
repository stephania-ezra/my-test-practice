package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindSmallestElement {
    private final Logger log = LogManager.getLogger(FindSmallestElement.class);

    public static void main(String[] args) {
        FindSmallestElement findSmallestElement = new FindSmallestElement();
        findSmallestElement.getSmallestElement();
    }

    void getSmallestElement() {
        int[] numbers = {20, 22, 18, 35, 48, 26, 87, 701};
        int smallestNumber = numbers[0];

        for (int number : numbers) {
            if (smallestNumber > number) {
                smallestNumber = number;
            }
        }
        log.info("Smallest number is :{}", smallestNumber);
    }
}
