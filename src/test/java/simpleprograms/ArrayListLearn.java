package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class ArrayListLearn {
    private final Logger log = LogManager.getLogger(ArrayListLearn.class);

    public static void main(String[] args) {
        ArrayListLearn arrayListLearn = new ArrayListLearn();
        arrayListLearn.createAndDisplayArrayList();
    }

    void createAndDisplayArrayList() {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("pineapple");
        fruits.add("guava");
        fruits.add("guava");

        /*log.info(fruits);

        log.info(fruits.getLast()); //printing last index
        log.info(fruits.get(2));
        log.info(fruits.size());*/

        //  log.info(fruits.isEmpty()); //false
        //log.info(fruits.contains("pineapple"));
        log.info(fruits.clone());

        // log.info(fruits.hashCode());
        //log.info(fruits.subList(2,4));
    }
}
