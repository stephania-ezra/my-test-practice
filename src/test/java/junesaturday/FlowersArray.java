package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class FlowersArray {
    private final Logger log = LogManager.getLogger(FlowersArray.class);

    public static void main(String[] args) {
        FlowersArray flowersArray = new FlowersArray();
        flowersArray.getFlowersArray();
    }

    void getFlowersArray() {
       /* Scanner sc = new Scanner(System.in);
        String[] flowers = new String[4];

        log.info("Enter the flowers");
        for (int i = 0; i < flowers.length; i++) {
            flowers[i] = sc.next();
        }

        Arrays.sort(flowers);
        log.info("After sorting");

        for (String flower : flowers) {
            log.info(flower);
        }

        log.info(flowers[2]); //PORTULACA*/

        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        log.info("Enter the numbers");


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        log.info("Displaying numbers");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                log.info("{} is even number", numbers[i]);
            } else {
                log.info("{} is odd number", numbers[i]);
            }
        }
    }
}
