package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
1. create an ArrayList
2.add items to arrayList
3.print it , print the size, getFirstElement , print the second element
4.remove fourth element
5.print it , print the size, getFirstElement , print the second element
6.replace second element with another flower.
7.create an iterator , loop through the iterator and print the arraylist
8.sort the arraylist
9.loop through the list and print it.

 */
public class FlowersArrayList {
    private final Logger log = LogManager.getLogger(FlowersArrayList.class);

    public static void main(String[] args) {
        FlowersArrayList flowersArrayList = new FlowersArrayList();
        flowersArrayList.getFlowersArrayList();
    }

    void getFlowersArrayList() {

        /*ArrayList<String> flowers = new ArrayList<String>();
        flowers.add("Rose");
        flowers.add("Portulaca");
        flowers.add("Lily");
        flowers.add("Bougenvilla");
        flowers.add("Bougenvilla");

        log.info(flowers);
        log.info(flowers.size());
        log.info(flowers.getFirst());

        log.info(flowers.get(2));


        flowers.remove("Lily");
        log.info(flowers.size());
        log.info(flowers);
        log.info(flowers.get(2));

        flowers.set(2, "Sunflower");
        log.info(flowers);

        log.info(flowers.isEmpty());

        Iterator<String> it = flowers.iterator();

        while (it.hasNext()) {
            log.info(it.next());
        }

        Collections.sort(flowers);
        log.info("Sorted Flowers ArrayList in Ascending Order");
        for (String flower : flowers) {
            log.info(flower);
        }

        Collections.sort(flowers, Collections.reverseOrder());
        log.info("Sorted Flowers ArrayList in Descending Order");
        for (String flower : flowers) {
            log.info(flower);
        }*/

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(12);
        numbers.add(14);
        numbers.add(16);
        numbers.add(18);
        numbers.add(20);
        log.info(numbers.size());
        log.info(numbers); //[12, 14, 16, 18, 20]

        numbers.remove(4);
        log.info(numbers.size());
        log.info(numbers); //[12, 14, 16, 18]

        numbers.set(2, 100);
        log.info(numbers);

        Iterator<Integer> it = numbers.iterator();
        for (Integer number : numbers) {
            log.info(number);
        }

        Collections.sort(numbers, Collections.reverseOrder());
        log.info("Reverse Order");
        for (Integer number : numbers) {
            log.info(number);
        }
    }
}
