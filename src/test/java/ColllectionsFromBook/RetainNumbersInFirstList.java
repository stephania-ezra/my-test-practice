package ColllectionsFromBook;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RetainNumbersInFirstList {
    private final Logger log = LogManager.getLogger(RetainNumbersInFirstList.class);

    public static void main(String[] args) {
        RetainNumbersInFirstList rnifl = new RetainNumbersInFirstList();
        rnifl.getRetainNumbersInFirstList();
    }

    void getRetainNumbersInFirstList() {
        ArrayList<Integer> firstList = new ArrayList<>();
        ArrayList<Integer> secondList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        log.info("Enter 5 numbers");
        for (int i = 0; i < 5; i++) {
            firstList.add(sc.nextInt());
        }

        log.info("Enter next 5 numbers");
        for (int i = 0; i < 5; i++) {
            secondList.add(sc.nextInt());
        }
        firstList.retainAll(secondList);
        log.info(firstList);
    }
}
