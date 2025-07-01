package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class ColorsHashMap {
    private final Logger log = LogManager.getLogger(ColorsHashMap.class);

    public static void main(String[] args) {
        ColorsHashMap colorsHashMap = new ColorsHashMap();
        colorsHashMap.getColorsHashMap();
    }

    void getColorsHashMap() {

        HashMap<Integer, String> colors = new HashMap<Integer, String>();
        //adding values to colors hashmap

        colors.put(1, "RED");
        colors.put(2, "GREEN");
        colors.put(3, "BLUE");
        colors.put(4, "YELLOW");

        //Printing the hashmap

        log.info(colors); //{1 = RED, 2 = GREEN, 3 = BLUE, 4 = YELLOW}

        //Printing the keys in the hashmap
        log.info(colors.keySet()); //[1,2,3,4]

        //printing the values
        log.info(colors.values()); //[RED,GREEN,BLUE,YELLOW]

        for (Integer key : colors.keySet()) {
            log.info(key);
        }

        for (String value : colors.values()) {
            log.info(value);
        }

        log.info(colors.get(1)); //RED
        log.info(colors.get(2)); //GREEN
        log.info(colors.get(3)); //BLUE
        log.info(colors.get(4)); //YELLOW

        for (Integer key : colors.keySet()) {
            if (colors.get(key).equalsIgnoreCase("BLUE")) {
                log.info("Key:{} color:{}", key, colors.get(key));
            }
        }

    }
}
