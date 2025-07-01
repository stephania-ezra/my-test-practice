package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MultiplicationTable {

    private final Logger log = LogManager.getLogger(MultiplicationTable.class);

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printMultiplicationTable(5);
    }

    void printMultiplicationTable(int number) {
        log.info("Multiplication Table for: {}", number);
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            log.info("{} x{} ={}", number, i, result);
        }
    }
}
