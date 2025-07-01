package ColllectionsFromBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CompareTwoArrayList {
    private final Logger log = LogManager.getLogger(CompareTwoArrayList.class);

    public static void main(String[] args) {
        CompareTwoArrayList ctal = new CompareTwoArrayList();
        ctal.getCompareTwoArrayList();
    }

    void getCompareTwoArrayList() {

        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        log.info("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            firstList.add(sc.nextInt());
        }
        Collections.sort(firstList);

        log.info("Enter next 5 numbers");
        for (int i = 0; i < 5; i++) {
            secondList.add(sc.nextInt());
        }
        Collections.sort(secondList);


        if (firstList.equals(secondList)) {
            log.info("Both the list has same numbers");
        } else {
            log.info("both the list are not same");
        }
    }
}
