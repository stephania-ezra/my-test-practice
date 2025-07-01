package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Factorial {
    private final Logger log = LogManager.getLogger(Factorial.class);

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        factorial.getFactorial();
    }

    void getFactorial() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter the number");

        int number = sc.nextInt();
        long factorial = 1;

        //for (int i = 1; i <= number; i++) {
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        log.info("Factorial is:{}", factorial);
    }
}
