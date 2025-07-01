package simpleprograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class RectangleArea {
    private final Logger log = LogManager.getLogger(RectangleArea.class);

    public static void main(String[] args) {
        RectangleArea rectangleArea = new RectangleArea();
        rectangleArea.calculateRectangleArea();
    }

    void calculateRectangleArea() {
        Scanner sc = new Scanner(System.in);
        log.info("Enter Length of the Rectangle");
        int length = sc.nextInt();

        log.info("Enter Width of the Rectangle");
        int Width = sc.nextInt();

        int area;

        area = length * Width;
        log.info("Area of the rectangle:{}", area);
    }
}
