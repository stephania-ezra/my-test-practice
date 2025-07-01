package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Iterator;

public class WeekDaysHashSet {
    private final Logger log = LogManager.getLogger(WeekDaysHashSet.class);

    public static void main(String[] args) {
        WeekDaysHashSet weekDaysHashSet = new WeekDaysHashSet();
        weekDaysHashSet.getWeekDaysHashSet();
    }

    void getWeekDaysHashSet() {
        /*HashSet<String> weekDays = new HashSet<String>();
        weekDays.add("Sunday");
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");

        log.info(weekDays.size()); //7
        log.info(weekDays); //[Monday, Thursday, Friday, Sunday, Wednesday, Tuesday, Saturday]

        log.info(weekDays.isEmpty());
        log.info(weekDays.remove("Friday"));
        log.info(weekDays.contains("Wednesday"));
        log.info(weekDays.add("anamika"));

        Iterator<String> it = weekDays.iterator();
        // while (it.hasNext()) {
        //   log.info(it.next());
        //}

        for (String weekDay : weekDays) {
            log.info(weekDay);
        }*/

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(5);

        log.info(numbers); //[4,7,8,9,5]
        log.info(numbers.size());//5

        for (int i = 1; i <= 10; i++) {
            if (numbers.contains(i)) {
                log.info("yes ,numbers hashset contains: {}", i);
            } else {
                log.info("no ,numbers hashset doesnot contains: {}", i);
            }
        }
    }
}
