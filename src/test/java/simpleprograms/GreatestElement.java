package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GreatestElement {
    private final Logger log = LogManager.getLogger(GreatestElement.class);

    public static void main(String[] args) {
        GreatestElement greatestElement = new GreatestElement();
        greatestElement.findGreatestElement();
    }

    void findGreatestElement() {
        int[] numbers = {20, 22, 18, 35, 48, 26, 87, 701};
        int greatestNumber = numbers[0];

        for (int number : numbers) {
            if (greatestNumber < number) {
                greatestNumber = number;
            }
        }
        log.info("Greatest Number:{}", greatestNumber);
    }
}

/*
greatestNumber = 20
if (20<22) => greatestNumber =22;
if(22 <18) => no greatestNumber= 22;
if (22<35 ) yes -> greatestNumber= 35;
if (35<48) yes ->greatestNumber = 48
if (48 <26) no -> greatestNumber = 48
if (48 < 87) yes -> greatestNumber = 87;
if(87 <701) yes -> greatestNumber = 701;

 */