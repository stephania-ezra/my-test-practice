package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class AddNumbers {
    private final Logger log = LogManager.getLogger(AddNumbers.class);

    public static void main(String[] args) {
        AddNumbers addNumber = new AddNumbers();
        addNumber.checkAddition();
    }

    void checkAddition() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter number 1");
        log.info("Enter number 2");
        int number1 = Integer.parseInt(sc.next());
        int number2 = Integer.parseInt(sc.next());

        int sum = number1 + number2;
        log.info("sum is:{}", sum);
    }
}
