package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class EvenOrOdd {
    private final Logger log = LogManager.getLogger(EvenOrOdd.class);

    public static void main(String[] args) {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        evenOrOdd.checkEvenOrOdd();
    }

    void checkEvenOrOdd() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter the number");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            log.info("The number {} is an even number", number);
        } else {
            log.info("The number {} is odd number", number);
        }
    }
}
