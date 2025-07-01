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
6.replace second element with another shape.
7.create an iterator , loop through the iterator and print the arraylist
8.sort the arraylist
9.loop through the list and print it.

 */
public class ShapesArrayList {
    private final Logger log = LogManager.getLogger(ShapesArrayList.class);

    public static void main(String[] args) {
        ShapesArrayList shapesArrayList = new ShapesArrayList();
        shapesArrayList.getShapesArrayList();
    }

    void getShapesArrayList() {
        ArrayList<String> shapes = new ArrayList<String>();

        shapes.add("Circle");
        shapes.add("Square");
        shapes.add("Triangle");
        shapes.add("Rectangle");
        shapes.add("Parallelogram");

        log.info(shapes);
        log.info(shapes.size());
        log.info(shapes.getFirst());
        log.info(shapes.get(2));

        log.info(shapes.remove(4));
        log.info(shapes);
        log.info(shapes.size());
        log.info(shapes.getFirst());
        log.info(shapes.get(2));

        shapes.set(2, "Rhombus");
        log.info(shapes);

        Iterator<String> it = shapes.iterator();
        for (String shape : shapes) {
            log.info(shape);
        }

        Collections.sort(shapes);
        for (String shape : shapes) {
            log.info(shape);
        }
    }
}
