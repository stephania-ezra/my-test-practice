package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class HashMapLearn {
    private final Logger log = LogManager.getLogger(HashMapLearn.class);

    public static void main(String[] args) {
        HashMapLearn hashMapLearn = new HashMapLearn();
        hashMapLearn.createAndDisplayHashMap();
    }

    void createAndDisplayHashMap() {
        HashMap<Integer, String> employee = new HashMap<Integer, String>();
        employee.put(1, "Jacob");
        employee.put(2, "Collins");
        employee.put(3, "Joseph");
        employee.put(4, "Victor");

        //log.info("HashMap contents:");
        //log.info(employee.get(1));

        for (Integer key : employee.keySet()) {
            if (employee.get(key).equalsIgnoreCase("Victor")) {
                log.info("Id: {} Name: {}", key, employee.get(key));
            }
        }
    }
}
