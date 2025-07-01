package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ColorsArrayList {
    private final Logger log = LogManager.getLogger(ColorsArrayList.class);

    public static void main(String[] args) {
        ColorsArrayList colorsArrayList = new ColorsArrayList();
        colorsArrayList.getColorsList();
    }

    void getColorsList() {

        ArrayList<String> colors = new ArrayList<String>();

        //adding data to the colors list
        colors.add("RED");
        colors.add("GREEN");
        colors.add("BLUE");
        colors.add("YELLOW");
        colors.add("YELLOW");
        colors.add(0, "IDIOT");

        //printing the colors list
        log.info(colors); //[RED, GREEN, BLUE, YELLOW]

        //printing the size of the list
        log.info(colors.size()); // 4

        //remove a data from the list
        colors.remove("RED");

        //printing the colors list
        log.info(colors); //[GREEN, BLUE, YELLOW]

        //printing the size of the list
        log.info(colors.size());  // 3

        //getting element in 2nd index
        log.info(colors.get(2)); // YELLOW

        //replace the element in 2nd index
        log.info(colors.set(2, "FELLOW"));

        //getting the first data
        log.info(colors.getFirst()); // GREEN

        //getting the last data
        log.info(colors.getLast()); // YELLOW

        //check whether the list is empty
        log.info(colors.isEmpty()); //false

        //create an iterator for the arrayList
        Iterator<String> it = colors.iterator();

        //iterate through the arraylist using the iterator
        while (it.hasNext()) {
            log.info(it.next());
        }

        for (String color : colors) {
            log.info(color);
        }

        //SORT an array list
        Collections.sort(colors);
        for (String color : colors) {
            log.info(color);
        }
    }
}
