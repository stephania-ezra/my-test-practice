package junesaturday;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ColorsArray {
    private final Logger log = LogManager.getLogger(ColorsArray.class);

    public static void main(String[] args) {
        ColorsArray colorsArray = new ColorsArray();
        colorsArray.getColorsArray();
    }

    void getColorsArray() {
        /*String[] colors = {"RED", "BLUE", "GREEN", "YELLOW"};
        log.info(colors.length);

        for (String color : colors) {
            log.info(color);
        }*/

        Scanner sc = new Scanner(System.in);
        String[] colors = new String[4];

        log.info("Enter array elements");
        for (int i = 0; i < colors.length; i++) {
            colors[i] = sc.next();
        }

        int size = colors.length;
        Arrays.sort(colors);
        log.info("After sorting");
        for (String color : colors) {
            log.info(color);
        }

        log.info(colors[size - 2]);
    }
}
