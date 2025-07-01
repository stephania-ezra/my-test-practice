package seleniuminterviewquestions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Trial {
    private final Logger log = LogManager.getLogger(Trial.class);

    public static void main(String[] args) {
        Trial trial = new Trial();
        trial.printingValues();
    }

    void printingValues() {
        String name = "Peter";
        int studentId = 234;
        int age = 25;
        float fees = 134.f;
        char grade = 'A';

        log.info("Student Name: {}", name);
        log.info("Student Id: {}", studentId);
        log.info("Student Age: {}", age);
        log.info("Student Fees: {}", fees);
        log.info("Student Grade: {}", grade);
    }
}
