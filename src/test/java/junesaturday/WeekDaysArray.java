package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class WeekDaysArray {
    private final Logger log = LogManager.getLogger(WeekDaysArray.class);

    public static void main(String[] args) {
        WeekDaysArray weekdaysArray = new WeekDaysArray();
        weekdaysArray.getWeekdaysArray();
    }

    void getWeekdaysArray() {
        String[] weekDays = new String[7];
        Scanner sc = new Scanner(System.in);

        log.info("Enter the days of the week");
        for (int i = 0; i < weekDays.length; i++) {
            weekDays[i] = sc.nextLine();
        }

        //Arrays.sort(weekDays);
        Collections.reverse(Arrays.asList(weekDays));
        for (String weekDay : weekDays) {
            log.info(weekDay);
        }
    }
}
