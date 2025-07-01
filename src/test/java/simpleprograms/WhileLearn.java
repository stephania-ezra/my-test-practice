package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class WhileLearn {
    private final Logger log = LogManager.getLogger(WhileLearn.class);

    public static void main(String[] args) {
        WhileLearn wl = new WhileLearn();
        wl.checkDice();
    }

    void checkDice() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter dice number");
        int diceNumber = Integer.parseInt(sc.nextLine());

        if (diceNumber < 6) {
            log.info("not yatzy");
        } else if (diceNumber > 6) {
            log.info("not yatzy number");
        } else {
            log.info("it is yatzy");
        }
    }
}
