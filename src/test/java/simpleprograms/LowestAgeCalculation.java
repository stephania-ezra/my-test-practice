package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LowestAgeCalculation {
    private final Logger log = LogManager.getLogger(LowestAgeCalculation.class);

    public static void main(String[] args) {
        LowestAgeCalculation lowestAgeCalculation = new LowestAgeCalculation();
        lowestAgeCalculation.calculateLowestAge();
    }
    void calculateLowestAge() {
        int[] ages = {25, 30, 18, 22, 29};
        int lowestAge = ages[0];
        log.info("Calculating Lowest Age from Array: {}", ages);

        for (int age : ages) {
            if (age < lowestAge) {
                lowestAge = age;
            }
        }

        log.info("The lowest age is: {}", lowestAge);
    }
}

//ages[0] = lowest age = 25;
//25<25
//30<25
//18<25 => lowest age = 18
//22<18
//

