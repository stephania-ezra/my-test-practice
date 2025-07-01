package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashSet;
import java.util.Iterator;

/*
1. create an ShapesHashSet
2.add items to ShapesHashSet


6.replace second element with another shape.
7.create an iterator , loop through the iterator and print the ShapesHashSet
8.sort the ShapesHashSet
9.loop through the ShapesHashSet and print it.

 */
public class ShapesHashSet {
    private final Logger log = LogManager.getLogger(ShapesHashSet.class);

    public static void main(String[] args) {
        ShapesHashSet shapesHashSet = new ShapesHashSet();
        shapesHashSet.getShapesHashSet();
    }

    void getShapesHashSet() {
        HashSet<String> shapes = new HashSet<String>();

        shapes.add("Circle");
        shapes.add("Square");
        shapes.add("Triangle");
        shapes.add("Rectangle");
        shapes.add("Rhombus");

        log.info(shapes); //[Circle,Square,Triangle,Rectangle,Rectangle]
        log.info(shapes.size()); //5
        log.info(shapes.isEmpty());
        //no getFirst() in Hashset
        //cant able to get the index value in set

        shapes.remove("Rhombus");
        log.info(shapes);

        Iterator<String> it = shapes.iterator();

        for (String shape : shapes) {
            log.info(shape);
        }

        log.info(shapes.isEmpty());
    }
}
