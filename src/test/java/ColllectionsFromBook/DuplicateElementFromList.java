package ColllectionsFromBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Integers;
import simpleprograms.HashSetLearning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementFromList {
    private final Logger log = LogManager.getLogger(DuplicateElementFromList.class);

    public static void main(String[] args) {
        DuplicateElementFromList duplicateElementFromList = new DuplicateElementFromList();
        duplicateElementFromList.getDuplicateElementFromList();
    }

    void getDuplicateElementFromList() {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(34);
        numbers.add(34);
        numbers.add(54);
        numbers.add(54);
        numbers.add(44);

        log.info(numbers);

//Creating a Hashset
        Set<Integer> integersSet = new HashSet<Integer>();

        for (Integer number : numbers) {
            if (!integersSet.add(number)) {
                log.info("Duplicate Number is:{}", number);
            }
        }
    }
}

