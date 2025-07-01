package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLearn {
    private final Logger log = LogManager.getLogger(IteratorLearn.class);

    public static void main(String[] args) {
        IteratorLearn iteratorLearn = new IteratorLearn();
        iteratorLearn.printFirstItem();
    }

    void printFirstItem() {
        ArrayList<String> fruits = new ArrayList<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Date");
        fruits.add("Kiwi");

// Get an iterator for the ArrayList
        Iterator<String> it = fruits.iterator();

        //Iterate through the list using the iterator
        while (it.hasNext()) {
            log.info(it.next());
        }

        /*for (String fruit : fruits) {
            log.info(fruit);
        }*/
    }
}
