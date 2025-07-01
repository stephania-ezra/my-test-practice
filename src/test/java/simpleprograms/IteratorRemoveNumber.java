package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorRemoveNumber {
    private final Logger log = LogManager.getLogger(IteratorRemoveNumber.class);

    public static void main(String[] args) {
        IteratorRemoveNumber iteratorRemoveNumber = new IteratorRemoveNumber();
        iteratorRemoveNumber.removeNumbersLessThanTen();
    }

    void removeNumbersLessThanTen() {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(5);
        numbers.add(15);
        numbers.add(3);
        numbers.add(7);

        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if (i > 10) {
                it.remove();
            }
        }
        log.info(numbers);
    }
}
