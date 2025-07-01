package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DifferentDataType {
    private final Logger log = LogManager.getLogger(DifferentDataType.class);

    public static void main(String[] args) {
        DifferentDataType ddt = new DifferentDataType();
        ddt.calculateTotalCost();
    }

    void calculateTotalCost() {
       /* int numberOfItems = 10;
        float eachCost = 9.99f;
        int totalCost = (int) (numberOfItems * eachCost);
        char currency = '$';

        log.info("Total number of items: {}", numberOfItems);
        log.info("Cost of each item: {}", eachCost);
        log.info("Total cost is:{}{}", totalCost, currency);*/

        String firstName = "Robin ";
        String lastName = "Sharma";
       // log.info(firstName.concat(lastName));

        log.info("{} {}", firstName, lastName);
    }
}
