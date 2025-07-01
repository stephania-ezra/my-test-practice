package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class HashMapLearning {
    private final Logger log = LogManager.getLogger(HashMapLearning.class);

    public static void main(String[] args) {
        HashMapLearning HashMapLearning = new HashMapLearning();
        HashMapLearning.createAndDisplayHashMap();
    }

    void createAndDisplayHashMap() {
        /*HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("India", "New Delhi");
        capitalCities.put("Japan", "Tokyo");

        log.info(capitalCities);*/

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Collins");
        map.put(2, "Raj");
        map.put(3, "Divya");

        log.info(map.get(1)); //Collins
        log.info(map.get(2));//Raj
        log.info(map.get(3)); //Divya

        log.info(map); // {1=Collins, 2=Raj, 3=Divya}
        log.info(map.values()); //{Collins , Raj ,Divya}
        log.info(map.keySet()); //[ 1 ,2 ,3]

        //check for value "Divya"
        for (Integer key : map.keySet()) {
            if (map.get(key).equalsIgnoreCase("Divya")) {
                log.info("Key:"+" " + key + " Name:" +" "+map.get(key));
            }
        }
    }
}