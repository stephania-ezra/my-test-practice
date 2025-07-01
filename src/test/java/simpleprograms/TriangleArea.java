package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleArea {
    private final Logger log = LogManager.getLogger(TriangleArea.class);

    public static void main(String[] args) {

        TriangleArea ta = new TriangleArea();
        ta.printingArea();
    }

    void printingArea(){

        // creating integer variables
        int length = 13;
        int breadth = 15;
        int area ;

        // area calculation

        area = length * breadth;
        log.info("Length is: {}", length);
        log.info("Breadth is: {}", breadth);
        log.info("Area is: {}", area);
    }
}
