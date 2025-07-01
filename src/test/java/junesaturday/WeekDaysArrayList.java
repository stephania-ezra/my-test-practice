package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;

public class WeekDaysArrayList {
    private final Logger log = LogManager.getLogger(WeekDaysArrayList.class);

    public static void main(String[] args) {
        WeekDaysArrayList weekDaysArrayList = new WeekDaysArrayList();
        weekDaysArrayList.getWeekDaysArrayList();
    }

    void getWeekDaysArrayList() {
        /*ArrayList<String> weekDays = new ArrayList<String>();
        weekDays.add("Sunday");
        weekDays.add("Monday");
        weekDays.add("Tuesday");
        weekDays.add("Wednesday");
        weekDays.add("Thursday");
        weekDays.add("Friday");
        weekDays.add("Saturday");

        // log.info(weekDays.size()); //7
        //log.info(weekDays); // [Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]

        weekDays.add("Ethan");
        //log.info(weekDays.size()); //8
        //log.info(weekDays);//[Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Ethan]

        weekDays.remove("Wednesday");
        //log.info(weekDays.size());//7
        //log.info(weekDays);//[Sunday, Monday, Tuesday, Thursday, Friday, Saturday, Ethan]

        weekDays.remove(4);
        log.info(weekDays.size());//6
        log.info(weekDays);//[Sunday, Monday, Tuesday, Thursday, Saturday, Ethan]

        log.info(weekDays.get(4)); //Saturday

        log.info(weekDays.getFirst()); //Sunday
        log.info(weekDays.getLast());//Sunday

        Collections.sort(weekDays);
        for (String weekDay : weekDays) {
            log.info(weekDay);
        }
        Collections.sort(weekDays, Collections.reverseOrder());
        for (String weekDay : weekDays) {
            log.info(weekDay);
        }*/

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(90);
        numbers.add(85);
        numbers.add(45);
        numbers.add(91);
        numbers.add(54);

        log.info(numbers.size());
        log.info(numbers);//[90, 85, 45, 91, 54]

        numbers.add(1000);
        log.info(numbers.size());
        log.info(numbers);

        log.info(numbers.getFirst()); //90
        log.info(numbers.getLast());//1000

        log.info(numbers.remove(3));
        log.info(numbers.size());
        log.info(numbers);//[90, 85, 45, 54, 1000]

        log.info(numbers.get(2)); //45

        /*Collections.sort(numbers);
        for (Integer number : numbers) {
            log.info(number);
        }*/

        Collections.sort(numbers,Collections.reverseOrder());
        for (Integer number : numbers) {
            log.info(number);
        }
    }
}


