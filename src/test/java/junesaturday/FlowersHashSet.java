package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class FlowersHashSet {
    private final Logger log = LogManager.getLogger(FlowersHashSet.class);

    public static void main(String[] args) {
        FlowersHashSet flowersHashSet = new FlowersHashSet();
        flowersHashSet.getFlowersHashSet();
    }

    void getFlowersHashSet() {
        /*HashSet<String> flowers = new HashSet<String>();

        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Daisy");
        flowers.add("Jasmine");
        flowers.add("Bougenvilla");
        flowers.add("Bougenvilla");

        log.info(flowers); //[Jasmine, Rose, Daisy, Lily, Bougenvilla]

        flowers.remove("Bougenvilla");
        log.info(flowers); // [Jasmine, Rose, Daisy, Lily]

        log.info(flowers.isEmpty()); //false

        Iterator<String> it = flowers.iterator();
        for (String flower : flowers) {
            log.info(flower);
        }*/

        HashSet<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        log.info(numbers);//[50, 20, 40, 10, 30]
        log.info(numbers.size()); //5

        numbers.remove(50);
        log.info(numbers);//[20, 40, 10, 30]
        log.info(numbers.size());//4

        log.info(numbers.isEmpty());
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            log.info(it.next());
        }
    }
}
