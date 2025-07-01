package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Integers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class FlowersLinkedList {
    private final Logger log = LogManager.getLogger(FlowersLinkedList.class);

    public static void main(String[] args) {
        FlowersLinkedList flowersLinkedList = new FlowersLinkedList();
        flowersLinkedList.getFlowersLinkedList();
    }

    void getFlowersLinkedList() {
        //create a linked list
       /* LinkedList<String> flowers = new LinkedList<String>();

        flowers.add("Rose");
        flowers.add("Lily");
        flowers.add("Daisy");
        flowers.add("Sunflower");
        flowers.add("Marigold");

        //add jasmine to first of the list
        flowers.addFirst("Jasmine");
        flowers.addLast("Bougenvilla");


        //remove first flower
        flowers.removeFirst();

        //remove last flower
        flowers.removeLast();

        //get the first flower
        // log.info(flowers.getFirst());

        //log.info(flowers.getLast());

        Collections.sort(flowers,Collections.reverseOrder());

        for (String flower : flowers) {
            log.info(flower);
        }*/

        LinkedList<Integer> numbers = new LinkedList<Integer>();

        numbers.add(10);
        numbers.add(11);
        numbers.add(31);
        numbers.add(54);
        numbers.add(78);

        numbers.addFirst(100);
        numbers.addLast(1000);
        numbers.removeFirst();
        numbers.removeLast();

        //log.info(numbers.getFirst());
        //log.info(numbers.getLast());

        // log.info(numbers);

        //Collections.sort(numbers);
        numbers.sort(Collections.reverseOrder());
        for (Integer number : numbers) {
            log.info(number);
        }
    }
}
