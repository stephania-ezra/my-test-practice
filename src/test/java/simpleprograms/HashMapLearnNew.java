package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class HashMapLearnNew {

    private final Logger log = LogManager.getLogger(HashMapLearnNew.class);

    public static void main(String[] args) {
        HashMapLearnNew hashMapLearnNew = new HashMapLearnNew();
        hashMapLearnNew.checkKeyValuePair();
    }

    void checkKeyValuePair() {

        HashMap<String, String> countries = new HashMap<String, String>();
        countries.put("India", "NewDelhi");
        countries.put("France", "Paris");
        countries.put("Japan", "Tokyo");
        countries.put("Italy", "Rome");

        /*for (String country : countries.keySet()) {
            log.info(country);
        }

        for (String country : countries.values()) {
            log.info(country);
        }*/

        for (String country : countries.keySet()){
            log.info("Country {} Capital: {} ", country, countries.get(country));
        }
    }
}
