package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Iterator;

public class ColorsHashSet {
    private final Logger log = LogManager.getLogger(ColorsHashSet.class);

    public static void main(String[] args) {
        ColorsHashSet colorsHashSet = new ColorsHashSet();
        colorsHashSet.getColorsHashSet();
    }

    void getColorsHashSet() {
        HashSet<String> colors = new HashSet<String>();

        //adding data to hashset
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");
        colors.add("YELLOW");
        colors.add("YELLOW");

        //won't allow duplicates
        //Printing the hashset
        log.info(colors); //[RED, BLUE, YELLOW, GREEN]

        //getting the number of data in the hashset
        log.info(colors.size()); //4

        //remove a color and print the hashset
        colors.remove("BLUE");
        log.info(colors);// [RED YELLOW GREEN ]
        //DOESN'T MAINTAIN ORDER

        log.info(colors.contains("RED")); //true
        log.info(colors.isEmpty()); //false

        //Get an iterator for colors hashset
        Iterator<String> it = colors.iterator();

        //iterate through the hashset using the iterator
        while (it.hasNext()) {
            log.info(it.next());
        }
        //[RED YELLOW GREEN]

    }
}
