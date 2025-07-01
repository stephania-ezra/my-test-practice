package HashMapPrograms;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountDuplicateNumbers {
    private final Logger log = LogManager.getLogger(CountDuplicateNumbers.class);

    public static void main(String[] args) {
        CountDuplicateNumbers countDuplicateNumbers = new CountDuplicateNumbers();
        countDuplicateNumbers.getDuplicateNumberCount();
    }

    void getDuplicateNumberCount() {
        int[] numbers = new int[5];
        Scanner sc = new Scanner(System.in);

        log.info("enter the numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        //creating a hashmap to store numbers and count
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (Integer number : numbers) {
            if (map.containsKey(number)) {
                int count = map.get(number);
                count++;
                map.replace(number, count);
                log.info("Duplicate number is:{} its count is:{}", number, count);
            } else {
                map.put(number, 1);
            }
        }

        //iterate hashmap
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            log.info("Number:{} Occurrences:{}", entry.getKey(), entry.getValue());
        }

    }
}

