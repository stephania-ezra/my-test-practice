package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class FlowersHashMap {
    private final Logger log = LogManager.getLogger(FlowersHashMap.class);

    public static void main(String[] args) {
        FlowersHashMap flowersHashMap = new FlowersHashMap();
        flowersHashMap.getFlowersHashMap();
    }

    void getFlowersHashMap() {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Rose");
        map.put(2, "Lily");
        map.put(3, "Daisy");
        map.put(4, "Jasmine");
        map.put(5, "Bougenvilla");

        log.info(map);

        log.info(map.keySet()); //[1, 2, 3, 4, 5]
        log.info(map.get(1)); //Rose
        log.info(map.get(2)); //Lily
        log.info(map.get(3)); //Daisy
        log.info(map.get(4)); //Jasmine
        log.info(map.get(5)); //Bougenvilla

        log.info(map.values()); //[Rose, Lily, Daisy, Jasmine, Bougenvilla]

        for (Integer key : map.keySet()) {
            log.info("Number:{} Flower:{}", key, map.get(key));
        }

        //check jasmine flower
        for (Integer key : map.keySet()) {
            if (map.get(key).equalsIgnoreCase("Jasmine")) {
                log.info("key:{} Flower:{}", key, map.get(key));
            }
        }

        HashMap<String, String> flowersMap = new HashMap<String, String>();
        flowersMap.put("Chennai", "Trichy");
        flowersMap.put("India", "NewDelhi");
        flowersMap.put("Japan", "Tokyo");
        flowersMap.put("Rome", "Italy");
        flowersMap.put("","Tammanah"); //allows one null key


        log.info(flowersMap);//{Rome=Italy, Chennai=Trichy, Japan=Tokyo, India=NewDelhi}

        log.info(flowersMap.keySet()); //[Chennai,India,Japan,Rome] // need not be in order
        log.info(flowersMap.values()); //[Trichy,NewDelhi,Tokyo,Italy] // need not be in order

        log.info(flowersMap.get("Chennai")); //Trichy
        log.info(flowersMap.get("India")); //NewDelhi
        log.info(flowersMap.get("Japan")); //Tokyo
        log.info(flowersMap.get("Rome")); //Italy

        for (String key : flowersMap.keySet()) {
            if (flowersMap.get(key).equalsIgnoreCase("Tokyo")) {
                log.info("City: {} Capital:{}", key, flowersMap.get(key));
            }
        }
    }
}