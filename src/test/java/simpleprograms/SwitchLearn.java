package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class SwitchLearn {
    private final Logger log = LogManager.getLogger(SwitchLearn.class);

    public static void main(String[] args) {
        SwitchLearn sl = new SwitchLearn();
        sl.checkDayOfTheWeek();
    }

    void checkDayOfTheWeek() {

        Scanner sc = new Scanner(System.in);
        log.info("Enter the day numberx");
        int day = Integer.parseInt(sc.nextLine());

        switch (day) {
            case 1:
                log.info("Monday");
                break;
            case 2:
                log.info("Tuesday");
                break;
            case 3:
                log.info("Wednesday");
                break;
            case 4:
                log.info("Thursday");
                break;
            case 5:
                log.info("Friday");
                break;
            case 6:
                log.info("Saturday");
                break;
            case 7:
                log.info("sunday");
                break;
            default:
                log.info("All day is a good day");
        }
    }
}
