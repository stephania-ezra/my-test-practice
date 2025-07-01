package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class WeekDaysHashMap {
    private final Logger log = LogManager.getLogger(WeekDaysHashMap.class);

    public static void main(String[] args) {
        WeekDaysHashMap weekDaysHashMap = new WeekDaysHashMap();
        weekDaysHashMap.getWeekDaysHashMap();
    }

    void getWeekDaysHashMap() {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Sunday");
        map.put(2, "Monday");
        map.put(3, "Tuesday");
        map.put(4, "Wednesday");
        map.put(5, "Thursday");
        map.put(6, "Friday");
        map.put(7, "Saturday");
        map.put(7, "Saturday");

        log.info(map.size()); //7
        log.info(map);//{1=Sunday, 2=Monday, 3=Tuesday, 4=Wednesday, 5=Thursday, 6=Friday, 7=Saturday}

        log.info(map.get(1));  //Sunday
        log.info(map.get(2)); //Monday
        log.info(map.get(3)); //Tuesday
        log.info(map.get(4)); //Wednesday
        log.info(map.get(5)); //Thursday
        log.info(map.get(6)); //Friday
        log.info(map.get(7)); //Saturday


        log.info(map.keySet());//[1, 2, 3, 4, 5, 6, 7]
        log.info(map.values());//[Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday]
        log.info(map.remove(1, "Sunday"));
        log.info(map);

        log.info(map.containsKey(4));//true

       /* for (Integer key : map.keySet()) {
            if (map.get(key).equalsIgnoreCase("Thursday")) {
                log.info("Number:{} WeekDays:{}", key, map.get(key));
            }
        }*/

        // Print keys and values

        for (Integer key : map.keySet()) {
            log.info("Number:{} Days:{}", key, map.get(key));
        }
    }
}
